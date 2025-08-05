package com.cibertec.saludvital.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String numeroIdentificacion;

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean tieneAlergias;
    private String listaAlergias;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Cita> citas;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private ExpedienteMedico expediente;
}
