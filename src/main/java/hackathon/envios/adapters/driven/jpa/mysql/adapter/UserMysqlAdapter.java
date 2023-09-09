package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.mappers.IUserEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IUserRepository;
import hackathon.envios.domain.model.User;
import hackathon.envios.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserMysqlAdapter implements IUserPersistencePort {
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(User user) {

        if (userRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException();
        }
        user.setContrasena(passwordEncoder.encode(user.getContrasena()));

        userRepository.save(userEntityMapper.toEntity(user));
    }

    @Override
    public User getUser(String mail) {
        return userEntityMapper.toUser(userRepository.findByEmail(mail).orElseThrow(RuntimeException::new));
    }

}
