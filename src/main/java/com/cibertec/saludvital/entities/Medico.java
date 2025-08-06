package com.cibertec.saludvital.entities;

import com.cibertec.saludvital.enums.Enums;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private Enums.EspecialidadMedico especialidad;

    @Enumerated(EnumType.STRING)
    private Enums.HorarioAtencion horarioAtencion;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Cita> citas;
}
