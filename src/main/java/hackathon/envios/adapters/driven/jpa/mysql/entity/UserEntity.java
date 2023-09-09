package hackathon.envios.adapters.driven.jpa.mysql.entity;
import hackathon.envios.domain.model.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    private String email;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private String telefono;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_rol")
    private RoleEntity rol;
}
