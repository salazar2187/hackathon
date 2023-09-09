package hackathon.envios.adapters.driven.jpa.mysql.repositories;


import hackathon.envios.adapters.driven.jpa.mysql.entity.PaqueteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaqueteRepository extends JpaRepository<PaqueteEntity, Long> {
}
