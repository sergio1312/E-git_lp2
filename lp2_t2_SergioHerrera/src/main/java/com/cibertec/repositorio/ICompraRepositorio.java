package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Compras;

public interface ICompraRepositorio extends JpaRepository<Compras, Integer> {

}
