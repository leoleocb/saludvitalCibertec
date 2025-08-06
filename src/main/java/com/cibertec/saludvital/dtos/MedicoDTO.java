package com.cibertec.saludvital.dtos;

import com.cibertec.saludvital.enums.Enums;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicoDTO {

    private Long id;

    @NotBlank(message = "El nombre del médico es obligatorio")
    private String nombre;

    @NotNull(message = "Debe seleccionar una especialidad")
    private Enums.EspecialidadMedico especialidad;

    @NotNull(message = "Debe seleccionar un horario de atención")
    private Enums.HorarioAtencion horarioAtencion;
}
