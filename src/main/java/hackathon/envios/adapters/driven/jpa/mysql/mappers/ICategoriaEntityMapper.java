package hackathon.envios.adapters.driven.jpa.mysql.mappers;

import hackathon.envios.adapters.driven.jpa.mysql.entity.CategoriaPaqueteEntity;
import hackathon.envios.domain.model.CategoriaPaquete;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ICategoriaEntityMapper {
    CategoriaPaquete toCategoriaPaquete(CategoriaPaqueteEntity categoriaPaqueteEntity);

    CategoriaPaqueteEntity toCategoriaPaqueteEntity(CategoriaPaquete categoriaPaquete);
}
