package hackathon.envios.domain.spi;

import hackathon.envios.domain.model.Direccion;

public interface IDireccionPersistencePort {
    Direccion saveDireccion(Direccion direccion);
}
