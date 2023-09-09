package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.mappers.IFragilidadEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IFragilidadRepository;
import hackathon.envios.domain.model.Fragilidad;
import hackathon.envios.domain.spi.IFragilidadPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FragilidadMySqlAdapter implements IFragilidadPersistencePort {
    private final IFragilidadRepository fragilidadRepository;
    private final IFragilidadEntityMapper fragilidadEntityMapper;

    @Override
    public Fragilidad getByName(String name) {
        return fragilidadEntityMapper.toFragilidad(fragilidadRepository.findByNombre(name).orElseThrow());
    }
}
