package com.cibertec.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.modelo.Productos;
import com.cibertec.repositorio.IProdRepositorio;

@Service
public class Productos_servicioImpl implements ProductosServicio{
	
	@Autowired
	private IProdRepositorio productoRepositorio;

	@Override
	public List<Productos> obtenerTodos() {		
		return productoRepositorio.findAll();
	}

	@Override
	public Productos obtenerPorId(Integer id) {
		return productoRepositorio.findById(id).orElse(null);
	}

	@Override
	public void guardarProducto(Productos producto) {
		productoRepositorio.save(producto);
	}
	
}
