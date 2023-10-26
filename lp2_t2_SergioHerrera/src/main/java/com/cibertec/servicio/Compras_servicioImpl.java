package com.cibertec.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.modelo.Compras;
import com.cibertec.repositorio.ICompraRepositorio;

@Service
public class Compras_servicioImpl implements ComprasServicio {
	
	@Autowired
	private ICompraRepositorio compraRepositorio;

	@Override
	public List<Compras> obtenerTodos() {
		return compraRepositorio.findAll();
	}

	@Override
	public Compras obtenerPorId(Integer id) {
		return compraRepositorio.findById(id).orElse(null);
	}

	@Override
	public void guardarCompra(Compras compra) {
		 compraRepositorio.save(compra);

	}
}
