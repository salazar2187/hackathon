package hackathon.envios.adapters.driven.jpa.mysql.mappers;

import hackathon.envios.adapters.driven.jpa.mysql.entity.EnvioEntity;
import hackathon.envios.domain.model.Envio;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IEnvioEntityMapper {
    Envio toEnvio(EnvioEntity envioEntity);

    EnvioEntity toEnvioEntity(Envio envio);
}
