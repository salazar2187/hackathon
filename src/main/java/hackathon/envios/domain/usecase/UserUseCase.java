package hackathon.envios.domain.usecase;

import hackathon.envios.domain.api.IUserServicePort;
import hackathon.envios.domain.api.MailExtractor;
import hackathon.envios.domain.model.User;
import hackathon.envios.domain.spi.IRolePersistencePort;
import hackathon.envios.domain.spi.IUserPersistencePort;
import org.springframework.stereotype.Component;

import static hackathon.envios.config.Constants.CUSTOMER_ROLE_ID;


@Component
public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;
    private final IRolePersistencePort rolePersistencePort;
    private final MailExtractor mailExtractor;


    public UserUseCase(IUserPersistencePort personPersistencePort, IRolePersistencePort rolePersistencePort, MailExtractor mailExtractor) {
        this.userPersistencePort = personPersistencePort;
        this.rolePersistencePort = rolePersistencePort;
        this.mailExtractor = mailExtractor;
    }

    @Override
    public void saveCliente(User user) {
        user.setRol(
                rolePersistencePort.getRol(CUSTOMER_ROLE_ID)
        );

        userPersistencePort.saveUser(user);
    }
}
