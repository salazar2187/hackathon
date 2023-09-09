package hackathon.envios.adapters.driving.http.handlers;

import hackathon.envios.adapters.driving.http.dto.request.EnvioRequestDto;
import hackathon.envios.adapters.driving.http.dto.response.EnvioResponseDto;

public interface IEnvioHandler {
    EnvioResponseDto generarEnvio(EnvioRequestDto envioRequestDto);
}
