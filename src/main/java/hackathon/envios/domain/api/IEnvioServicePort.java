package hackathon.envios.domain.api;

import hackathon.envios.adapters.driving.http.dto.request.EnvioRequestDto;
import hackathon.envios.domain.model.Envio;

public interface IEnvioServicePort {
    Envio generarEnvio(EnvioRequestDto envio);
}
