package hackathon.envios.domain.spi;

import hackathon.envios.domain.model.CategoriaPaquete;

public interface ICategoriaPaquetePersistencePort {
    CategoriaPaquete findByName(String name);
}
