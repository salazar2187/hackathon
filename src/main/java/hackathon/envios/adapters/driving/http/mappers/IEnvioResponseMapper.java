package hackathon.envios.adapters.driving.http.mappers;

import hackathon.envios.adapters.driving.http.dto.response.EnvioResponseDto;
import hackathon.envios.domain.model.Envio;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IEnvioResponseMapper {
    EnvioResponseDto toEnvioResponseDto(Envio envio);
}
