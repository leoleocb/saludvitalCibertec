package com.cibertec.saludvital.dtos;

import com.cibertec.saludvital.enums.Enums;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecetaDTO {

    private Long id;

    @NotBlank(message = "El nombre del medicamento es obligatorio")
    private String medicamento;

    @NotBlank(message = "La dosis es obligatoria")
    private String dosis;

    @NotNull(message = "Debe seleccionar la frecuencia")
    private Enums.FrecuenciaMedicamento frecuencia;

    @NotNull(message = "Debe seleccionar un paciente")
    private Long pacienteId;

    @NotNull(message = "Debe seleccionar un médico")
    private Long medicoId;
}
