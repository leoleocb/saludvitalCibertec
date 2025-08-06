package com.cibertec.saludvital.dtos;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PacienteDTO {

    private Long id;

    @NotBlank(message = "El número de identificación es obligatorio")
    private String numeroIdentificacion;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Past(message = "La fecha de nacimiento debe ser en el pasado")
    private LocalDate fechaNacimiento;

    private boolean tieneAlergias;

    @Size(max = 255, message = "La lista de alergias no puede superar los 255 caracteres")
    private String listaAlergias;
}
