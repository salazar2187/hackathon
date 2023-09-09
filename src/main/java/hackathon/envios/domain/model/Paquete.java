package hackathon.envios.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paquete {
    private Long id;
    private double valor_declarado;
    private CategoriaPaquete categoriaPaquete;
}
