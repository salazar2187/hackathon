package hackathon.envios.adapters.driven.jpa.mysql.mappers;
import hackathon.envios.adapters.driven.jpa.mysql.entity.DireccionEntity;
import hackathon.envios.domain.model.Direccion;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IDireccionEntityMapper {

    Direccion toDireccion(DireccionEntity direccion);

    DireccionEntity toDireccionEntity(Direccion direccion);
}
