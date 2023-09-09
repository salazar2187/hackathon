package hackathon.envios.adapters.driven.jpa.mysql.mappers;

import hackathon.envios.adapters.driven.jpa.mysql.entity.PaqueteEntity;
import hackathon.envios.domain.model.Paquete;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPaqueteEntityMapper {
    Paquete toPaquete(PaqueteEntity paqueteEntity);

    PaqueteEntity toPaqueteEntity(Paquete paquete);
}
