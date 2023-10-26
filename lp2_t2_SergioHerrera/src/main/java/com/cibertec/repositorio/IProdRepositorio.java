package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Productos;

public interface IProdRepositorio extends JpaRepository<Productos, Integer> {

}
