package hackathon.envios.adapters.driven.jpa.mysql.repositories;

import hackathon.envios.adapters.driven.jpa.mysql.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, String> {
    Optional<UserEntity> findByEmail(String id);
    Boolean existsByEmail(String mail);
}
