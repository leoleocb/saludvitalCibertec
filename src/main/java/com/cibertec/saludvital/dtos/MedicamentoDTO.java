package com.cibertec.saludvital.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicamentoDTO {

    private Long id;

    @NotBlank(message = "El nombre del medicamento es obligatorio")
    private String nombre;
}
