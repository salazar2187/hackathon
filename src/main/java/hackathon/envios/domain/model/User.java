package hackathon.envios.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String email;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Role rol;
}
