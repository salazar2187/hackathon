package hackathon.envios.domain.spi;


import hackathon.envios.domain.model.Role;


public interface IRolePersistencePort {
    Role getRol(Long id);
}
