package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.entity.EnvioEntity;
import hackathon.envios.adapters.driven.jpa.mysql.mappers.IEnvioEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IEnvioRepository;
import hackathon.envios.domain.model.Envio;
import hackathon.envios.domain.spi.IEnvioPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class EnvioMySqlAdapter implements IEnvioPersistencePort {
    private final IEnvioEntityMapper envioEntityMapper;
    private final IEnvioRepository envioRepository;
    @Override
    public Envio saveEnvio(Envio envio) {
        EnvioEntity envioEntity = envioEntityMapper.toEnvioEntity(envio);
        envioRepository.save(envioEntity);
        return envioEntityMapper.toEnvio(envioEntity);
    }
}
