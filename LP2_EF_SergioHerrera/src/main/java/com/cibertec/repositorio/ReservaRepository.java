package com.cibertec.repositorio;

import com.cibertec.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
   
}
