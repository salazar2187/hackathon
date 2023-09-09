package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.entity.PaqueteEntity;
import hackathon.envios.adapters.driven.jpa.mysql.mappers.ICategoriaEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.mappers.IPaqueteEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IPaqueteRepository;
import hackathon.envios.domain.model.CategoriaPaquete;
import hackathon.envios.domain.model.Paquete;
import hackathon.envios.domain.spi.IPaquetePersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PaqueteMySqlAdapter implements IPaquetePersistencePort {

    private final IPaqueteRepository paqueteRepository;
    private final IPaqueteEntityMapper paqueteEntityMapper;
    private final ICategoriaEntityMapper categoriaEntityMapper;

    @Override
    public Paquete savePaquete(double valor_declarado, CategoriaPaquete categoriaPaquete) {
        PaqueteEntity paquete = new PaqueteEntity();
        paquete.setValor_declarado(valor_declarado);
        paquete.setCategoriaPaquete(categoriaEntityMapper.toCategoriaPaqueteEntity(categoriaPaquete));
        paqueteRepository.save(paquete);
        return paqueteEntityMapper.toPaquete(paquete);
    }
}
