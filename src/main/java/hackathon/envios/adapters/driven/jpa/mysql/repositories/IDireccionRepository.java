package hackathon.envios.adapters.driven.jpa.mysql.repositories;

import hackathon.envios.adapters.driven.jpa.mysql.entity.DireccionEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionRepository extends JpaRepository<DireccionEntity, Long> {
}
