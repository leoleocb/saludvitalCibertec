package com.cibertec.saludvital.repositories;

import com.cibertec.saludvital.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    Optional<Medicamento> findByNombre(String nombre);
}
