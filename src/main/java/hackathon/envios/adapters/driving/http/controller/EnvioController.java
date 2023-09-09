package hackathon.envios.adapters.driving.http.controller;

import hackathon.envios.adapters.driving.http.dto.request.EnvioRequestDto;
import hackathon.envios.adapters.driving.http.dto.response.EnvioResponseDto;
import hackathon.envios.adapters.driving.http.handlers.IEnvioHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v2/envios")
public class EnvioController {

    private IEnvioHandler envioHandler;

    @PostMapping
    public ResponseEntity<EnvioResponseDto> solicitudEnvio(@RequestBody EnvioRequestDto envioRequestDto) {
        return new ResponseEntity<>(envioHandler.generarEnvio(envioRequestDto), HttpStatus.CREATED);
    }

}
