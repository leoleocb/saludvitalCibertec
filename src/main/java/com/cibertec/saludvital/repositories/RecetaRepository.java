package com.cibertec.saludvital.repositories;

import com.cibertec.saludvital.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
    List<Receta> findByPacienteId(Long pacienteId);
}
