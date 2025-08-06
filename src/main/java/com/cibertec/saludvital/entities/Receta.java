package com.cibertec.saludvital.entities;

import com.cibertec.saludvital.enums.Enums;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicamento;
    private String dosis;

    @Enumerated(EnumType.STRING)
    private Enums.FrecuenciaMedicamento frecuencia;

    private LocalDate fechaEmision;
    private LocalDate fechaCaducidad;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
}
