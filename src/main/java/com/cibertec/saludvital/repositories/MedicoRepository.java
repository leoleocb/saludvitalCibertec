package com.cibertec.saludvital.repositories;

import com.cibertec.saludvital.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
