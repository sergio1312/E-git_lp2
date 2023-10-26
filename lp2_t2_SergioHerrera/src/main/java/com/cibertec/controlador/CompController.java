package com.cibertec.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.cibertec.modelo.Compras;
import com.cibertec.servicio.ComprasServicio;

@Controller
public class CompController {
	@Autowired
	private ComprasServicio compraService;

	@GetMapping("/mostrarCarrito")
	public String mostrarCarrito(Model model) {
		model.addAttribute("compras", compraService.obtenerTodos());
		return "carrito";
	}

	@GetMapping("/resumenCompra")
	public String mostrarResumenCompra(Model model) {
		List<Compras> compras = compraService.obtenerTodos();

		double totalCompra = TotalCompra(compras);

		model.addAttribute("compras", compras);
		model.addAttribute("totalCompra", totalCompra);

		return "resumen";
	}

	private double TotalCompra(List<Compras> compras) {
		double total = 0.0;
		for (Compras compra : compras) {
			total += compra.getTotal();
		}
		return total;
	}
}
