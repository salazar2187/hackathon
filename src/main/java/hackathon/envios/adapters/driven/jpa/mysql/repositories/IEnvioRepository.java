package hackathon.envios.adapters.driven.jpa.mysql.repositories;

import hackathon.envios.adapters.driven.jpa.mysql.entity.EnvioEntity;
import hackathon.envios.domain.model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnvioRepository extends JpaRepository<EnvioEntity, Long> {
}
