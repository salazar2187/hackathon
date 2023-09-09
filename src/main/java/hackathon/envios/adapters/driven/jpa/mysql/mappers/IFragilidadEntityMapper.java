package hackathon.envios.adapters.driven.jpa.mysql.mappers;

import hackathon.envios.adapters.driven.jpa.mysql.entity.FragilidadEntity;
import hackathon.envios.domain.model.Fragilidad;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IFragilidadEntityMapper {
    Fragilidad toFragilidad(FragilidadEntity fragilidad);
    FragilidadEntity toFragilidadEntity(Fragilidad fragilidad);
}
