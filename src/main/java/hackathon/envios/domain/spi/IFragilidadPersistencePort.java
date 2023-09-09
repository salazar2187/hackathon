package hackathon.envios.domain.spi;

import hackathon.envios.domain.model.Fragilidad;

public interface IFragilidadPersistencePort {
    Fragilidad getByName(String name);
}
