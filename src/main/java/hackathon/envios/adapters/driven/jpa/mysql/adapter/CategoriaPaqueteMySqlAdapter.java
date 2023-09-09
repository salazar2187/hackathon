package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.mappers.ICategoriaEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.ICategoriaRepository;
import hackathon.envios.domain.model.CategoriaPaquete;
import hackathon.envios.domain.spi.ICategoriaPaquetePersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoriaPaqueteMySqlAdapter implements ICategoriaPaquetePersistencePort {
    private final ICategoriaEntityMapper categoriaEntityMapper;
    private final ICategoriaRepository categoriaRepository;

    @Override
    public CategoriaPaquete findByName(String name) {
        return categoriaEntityMapper.toCategoriaPaquete(categoriaRepository.findByNombre(name).orElseThrow());
    }
}
