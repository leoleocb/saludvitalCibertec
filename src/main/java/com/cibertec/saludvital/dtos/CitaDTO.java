package com.cibertec.saludvital.dtos;

import com.cibertec.saludvital.enums.Enums;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CitaDTO {

    private Long id;

    @NotNull(message = "La fecha es obligatoria")
    @FutureOrPresent(message = "La fecha no puede ser en el pasado")
    private LocalDate fecha;

    @NotNull(message = "La hora es obligatoria")
    private LocalTime hora;

    @NotNull(message = "Debe seleccionar un paciente")
    private Long pacienteId;

    @NotNull(message = "Debe seleccionar un médico")
    private Long medicoId;

    @NotBlank(message = "Debe indicar un consultorio")
    private String consultorio;

    @NotNull(message = "Debe seleccionar un estado")
    private Enums.EstadoCita estado;
}
