package com.cibertec.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.servicio.ProductosServicio;

@Controller
public class ProdController {
	
	@Autowired
	private ProductosServicio productoService;

	@GetMapping("/catalogo")
    public String mostrarCatalogo(Model model) {
        model.addAttribute("producto", productoService.obtenerTodos());
        return "catalogo";
    }

}
