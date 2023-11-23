package com.cibertec.servicio;

import com.cibertec.modelo.Habitacion;
import com.cibertec.repositorio.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    public List<Habitacion> obtenerTodas() {
        return habitacionRepository.findAll();
    }

    public Habitacion obtenerPorId(Integer id) {
        return habitacionRepository.findById(id).orElse(null);
    }

    public Habitacion guardarHabitacion(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }

}
