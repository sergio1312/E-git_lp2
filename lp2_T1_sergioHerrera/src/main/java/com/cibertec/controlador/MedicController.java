package com.cibertec.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.modelo.Medicamentos;
import com.cibertec.repositorio.IMedicRepositorio;

@Controller
@RequestMapping("/medicamentos")
public class MedicController {

    @Autowired
    private IMedicRepositorio medicRepositorio; 

    @GetMapping("/")
    public String listarMedicamentos(Model model) {
        List<Medicamentos> medicamentos = medicRepositorio.findAll();
        model.addAttribute("medicamentos", medicamentos);
        return "listarmedicamentos"; 
    }

    @GetMapping("/nuevo")
    public String nuevoMedicamento(Model model) {
        model.addAttribute("medicamento", new Medicamentos());
        return "nuevo"; 
    }
    
    @PostMapping("/guardar")
    public String guardarMedicamento(@ModelAttribute Medicamentos medicamento) {
        medicRepositorio.save(medicamento);
        return "redirect:/medicamentos/";
    }
}
