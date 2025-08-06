package com.cibertec.saludvital.repositories;

import com.cibertec.saludvital.entities.Cita;
import com.cibertec.saludvital.enums.Enums;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    List<Cita> findByMedicoIdAndFecha(Long medicoId, LocalDate fecha);
    List<Cita> findByPacienteIdAndFecha(Long pacienteId, LocalDate fecha);
    boolean existsByMedicoIdAndFechaAndHora(Long medicoId, LocalDate fecha, LocalTime hora);
    List<Cita> findByEstado(Enums.EstadoCita estado);
}
