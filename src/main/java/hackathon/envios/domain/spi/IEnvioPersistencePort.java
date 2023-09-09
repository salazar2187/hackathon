package hackathon.envios.domain.spi;

import hackathon.envios.domain.model.Envio;

public interface IEnvioPersistencePort {
    Envio saveEnvio(Envio envio);
}
