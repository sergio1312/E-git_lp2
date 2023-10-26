package com.cibertec.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.modelo.Productos;
import com.cibertec.servicio.ProductosServicio;

@Controller
public class CarritoController {
	private List<Productos> carrito = new ArrayList<>();

	@Autowired
	private ProductosServicio productoService;

	@PostMapping("/agragarproducto")
	public String agregarProducto(@RequestParam("productoId") Integer productoId) {
		Productos producto = productoService.obtenerPorId(productoId);
		carrito.add(producto);

		return "redirect:/catalogo";
	}

	@GetMapping("/carrito")
	public String mostrarCarrito(Model model) {
		
		model.addAttribute("productosEnCarrito", carrito);

		double montoTotal = carrito.stream().mapToDouble(Productos::getPrecio).sum();
		model.addAttribute("montoTotal", montoTotal);

		return "carrito";
	}
	
}
