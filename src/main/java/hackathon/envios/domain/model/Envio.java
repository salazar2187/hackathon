package hackathon.envios.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Envio {
    private Long id;
    private Double valorTotal;
    private Direccion direccionEnvio;
    private Direccion direccionDestinatario;
    private Paquete paquete;
    private Fragilidad fragilidad;
    private User remitente;
    private User repartidor;
}
