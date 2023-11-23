package com.cibertec.repositorio;

import com.cibertec.modelo.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
    
}