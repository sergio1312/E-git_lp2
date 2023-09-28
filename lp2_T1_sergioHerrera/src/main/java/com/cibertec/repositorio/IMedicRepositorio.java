package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Medicamentos;

public interface IMedicRepositorio extends JpaRepository<Medicamentos, Integer> {
	
}
