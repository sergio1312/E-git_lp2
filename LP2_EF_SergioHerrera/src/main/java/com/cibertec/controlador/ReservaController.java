package com.cibertec.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.modelo.Habitacion;
import com.cibertec.servicio.HabitacionService;

@Controller
public class ReservaController {

    private List<Habitacion> carritoReservas = new ArrayList<>();

    @Autowired
    private HabitacionService habitacionService;

    @PostMapping("/agregarAlCarrito")
    public String agregarAlCarrito(@RequestParam("habitacionId") Integer habitacionId) {
        Habitacion habitacion = habitacionService.obtenerPorId(habitacionId);
        carritoReservas.add(habitacion);

        return "redirect:/catalogo";
    }
    
    @GetMapping("/carrito")
    public String mostrarCarritoReservas(Model model) {
        model.addAttribute("habitacionesEnCarrito", carritoReservas);

        return "carrito";
    }
}