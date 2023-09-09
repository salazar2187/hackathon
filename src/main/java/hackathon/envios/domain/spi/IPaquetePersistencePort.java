package hackathon.envios.domain.spi;

import hackathon.envios.domain.model.CategoriaPaquete;
import hackathon.envios.domain.model.Paquete;

public interface IPaquetePersistencePort {
    Paquete savePaquete(double valor_declarado, CategoriaPaquete categoriaPaquete);
}
