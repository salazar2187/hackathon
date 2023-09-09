package hackathon.envios.adapters.driving.http.dto.request;

import hackathon.envios.domain.model.Direccion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvioRequestDto {
    private Double valor_declarado;
    private String fragilidad;
    private String categoria;
    private Direccion direccion_destinatario;
    private Direccion direccion_remitente;
}
