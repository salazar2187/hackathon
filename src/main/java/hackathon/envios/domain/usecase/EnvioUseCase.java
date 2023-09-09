package hackathon.envios.domain.usecase;

import hackathon.envios.adapters.driving.http.dto.request.EnvioRequestDto;
import hackathon.envios.domain.api.IEnvioServicePort;
import hackathon.envios.domain.model.CategoriaPaquete;
import hackathon.envios.domain.model.Direccion;
import hackathon.envios.domain.model.Envio;
import hackathon.envios.domain.model.Fragilidad;
import hackathon.envios.domain.model.Paquete;
import hackathon.envios.domain.spi.ICategoriaPaquetePersistencePort;
import hackathon.envios.domain.spi.IDireccionPersistencePort;
import hackathon.envios.domain.spi.IFragilidadPersistencePort;
import hackathon.envios.domain.spi.IPaquetePersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnvioUseCase implements IEnvioServicePort {

    private final IDireccionPersistencePort direccionPersistencePort;
    private final IFragilidadPersistencePort fragilidadPersistencePort;
    private final ICategoriaPaquetePersistencePort categoriaPaquetePersistencePort;
    private final IPaquetePersistencePort paquetePersistencePort;

    @Override
    public Envio generarEnvio(EnvioRequestDto envio) {
        Envio saveEnvio = new Envio();

        Direccion direccionEnvio = direccionPersistencePort.saveDireccion(envio.getDireccion_destinatario());
        saveEnvio.setDireccionEnvio(direccionEnvio);
        Direccion direccionDestinatario = direccionPersistencePort.saveDireccion(envio.getDireccion_remitente());
        saveEnvio.setDireccionDestinatario(direccionDestinatario);
        double valorDistancia = calcularValorDistancia(direccionEnvio, direccionDestinatario);

        Fragilidad fragilidad = fragilidadPersistencePort.getByName(envio.getFragilidad());
        saveEnvio.setFragilidad(fragilidad);
        double valorSeguro = calcularSeguro(envio.getValor_declarado(), fragilidad);

        CategoriaPaquete categoriaPaquete = categoriaPaquetePersistencePort.findByName(envio.getCategoria());
        Paquete paquete = paquetePersistencePort.savePaquete(envio.getValor_declarado(), categoriaPaquete);
        saveEnvio.setPaquete(paquete);

        double valorTotal = envio.getValor_declarado() + valorDistancia + valorSeguro;
        saveEnvio.setValorTotal(valorTotal);
        return null;
    }

    private Double calcularValorDistancia(Direccion direccion, Direccion direccion2){
        double radioTierra = 6371d;
        double latitud1Radianes = Math.toRadians(direccion.getLatitud());
        double longitud1Radianes = Math.toRadians(direccion.getLongitud());
        double latitud2Radianes = Math.toRadians(direccion2.getLatitud());
        double longitud2Radianes = Math.toRadians(direccion2.getLongitud());

        double latDiff = latitud2Radianes - latitud1Radianes;
        double lonDiff = longitud2Radianes - longitud1Radianes;

        double haversineComponent = Math.pow(Math.sin(latDiff / 2), 2) + Math.cos(latitud1Radianes) * Math.cos(latitud2Radianes) * Math.pow(Math.sin(lonDiff / 2), 2);
        double centralAngle = 2 * Math.atan2(Math.sqrt(haversineComponent), Math.sqrt(1 - haversineComponent));

        double distanceKM = radioTierra * centralAngle;
        return Math.abs(distanceKM);
    }

    private Double calcularSeguro(Double valor_declarado, Fragilidad fragilidad) {
        return switch (fragilidad.getNombre()) {
            case "fragil" -> valor_declarado * 0.05;
            case "muy fragil" -> valor_declarado * 0.1;
            default -> 0.01;
        };
    }
}
