package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.entity.DireccionEntity;
import hackathon.envios.adapters.driven.jpa.mysql.mappers.IDireccionEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IDireccionRepository;
import hackathon.envios.domain.model.Direccion;
import hackathon.envios.domain.spi.IDireccionPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DireccionMySqlAdapter implements IDireccionPersistencePort {

    private final IDireccionRepository direccionRepository;
    private final IDireccionEntityMapper direccionEntityMapper;
    @Override
    public Direccion saveDireccion(Direccion direccion) {
        DireccionEntity direccionEntity = direccionEntityMapper.toDireccionEntity(direccion);
        direccionRepository.save(direccionEntity);
        return direccionEntityMapper.toDireccion(direccionEntity);
    }
}
