package hackathon.envios.domain.api;


import hackathon.envios.domain.model.User;

public interface IUserServicePort {
    void saveCliente(User user);
}
