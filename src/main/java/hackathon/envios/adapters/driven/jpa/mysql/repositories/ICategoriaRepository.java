package hackathon.envios.adapters.driven.jpa.mysql.repositories;

import hackathon.envios.adapters.driven.jpa.mysql.entity.CategoriaPaqueteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICategoriaRepository extends JpaRepository<CategoriaPaqueteEntity, Long> {
    Optional<CategoriaPaqueteEntity> findByNombre(String nombre);
}
