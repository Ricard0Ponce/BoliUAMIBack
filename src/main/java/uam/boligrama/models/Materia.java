package uam.boligrama.models;

import lombok.Data;

@Data
// NOTA: Los atributos del Json se deben llamar igual que los atributos del objeto.
public class Materia {
    private Long id;
    private String nombre;
    private Long credito;
    private String tipo_optativa;
    private String seriacion;

}
