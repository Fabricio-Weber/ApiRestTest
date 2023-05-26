package med.voll.api.medic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;
import med.voll.api.address.AddressData;

@Table(name = "medics")
@Entity(name = "Medic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Medic {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty especialidade;

    @Embedded
    private Address endereco;

    public Medic(CreateMedicData data) {
        this.nome = data.nome();
        this.email = data.email();
        this.crm = data.crm();
        this.endereco = new Address(data.endereco());
    }
}
