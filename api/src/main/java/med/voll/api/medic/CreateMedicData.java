package med.voll.api.medic;

import med.voll.api.address.AddressData;

public record CreateMedicData(String nome,
                              String email,
                              String crm,
                              Specialty especialidade,
                              AddressData endereco) {
}
