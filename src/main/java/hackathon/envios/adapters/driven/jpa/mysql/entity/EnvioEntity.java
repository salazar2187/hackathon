package hackathon.envios.adapters.driven.jpa.mysql.entity;

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

@Entity
@Table(name = "envio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EnvioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_direccion_envio")
    private DireccionEntity direccionEnvio;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_direccion_destinatarion")
    private DireccionEntity direccionDestinatario;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_paquete")
    private PaqueteEntity paquete;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_fragilidad")
    private FragilidadEntity fragilidad;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_remitente")
    private UserEntity remitente;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_repartidor")
    private UserEntity repartidor;
    @Column(name = "valor_total")
    private Double valorTotal;
}
