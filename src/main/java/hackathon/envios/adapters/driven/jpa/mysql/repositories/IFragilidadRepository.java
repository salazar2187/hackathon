package hackathon.envios.adapters.driven.jpa.mysql.repositories;


import hackathon.envios.adapters.driven.jpa.mysql.entity.FragilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IFragilidadRepository extends JpaRepository<FragilidadEntity, Long> {
    Optional<FragilidadEntity> findByNombre(String name);
}
