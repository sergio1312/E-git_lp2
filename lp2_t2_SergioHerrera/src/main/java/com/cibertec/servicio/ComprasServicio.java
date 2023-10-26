package com.cibertec.servicio;

import java.util.List;
import com.cibertec.modelo.Compras;

public interface ComprasServicio {
	List<Compras> obtenerTodos();
	Compras obtenerPorId(Integer id);
	void guardarCompra(Compras compra);
}
