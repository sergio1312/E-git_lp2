package com.cibertec.servicio;

import java.util.List;
import com.cibertec.modelo.Productos;

public interface ProductosServicio {
	 List<Productos> obtenerTodos();
	 Productos obtenerPorId(Integer id);
	 void guardarProducto(Productos producto);
}
