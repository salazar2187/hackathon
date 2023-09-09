package hackathon.envios.adapters.driving.http.dto.response;

import hackathon.envios.domain.model.Direccion;
import hackathon.envios.domain.model.Fragilidad;
import hackathon.envios.domain.model.Paquete;
import hackathon.envios.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvioResponseDto {
    private Long id;
    private Double valorTotal;
    private Direccion direccionEnvio;
    private Direccion direccionDestinatario;
    private Paquete paquete;
    private Fragilidad fragilidad;
    private User remitente;
    private User repartidor;
}
