package com.cibertec.saludvital.repositories;

import com.cibertec.saludvital.entities.Medico;
import com.cibertec.saludvital.enums.Enums;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    List<Medico> findByEspecialidad(Enums.EspecialidadMedico especialidad);
    List<Medico> findByHorarioAtencion(Enums.HorarioAtencion horarioAtencion);
}
