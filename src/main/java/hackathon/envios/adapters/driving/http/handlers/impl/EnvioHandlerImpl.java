package hackathon.envios.adapters.driving.http.handlers.impl;
import hackathon.envios.adapters.driving.http.dto.request.EnvioRequestDto;
import hackathon.envios.adapters.driving.http.dto.response.EnvioResponseDto;
import hackathon.envios.adapters.driving.http.handlers.IEnvioHandler;
import hackathon.envios.adapters.driving.http.mappers.IEnvioRequestMapper;
import hackathon.envios.domain.api.IEnvioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnvioHandlerImpl implements IEnvioHandler {

    private final IEnvioServicePort envioServicePort;
    private final IEnvioRequestMapper envioResponseMapper;


    @Override
    public EnvioResponseDto generarEnvio(EnvioRequestDto envioRequestDto) {
        return null;
    }
}
