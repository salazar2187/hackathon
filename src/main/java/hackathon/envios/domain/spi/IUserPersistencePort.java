package hackathon.envios.domain.spi;


import hackathon.envios.domain.model.User;

public interface IUserPersistencePort {
    void saveUser(User user);

    User getUser(String mail);
}
