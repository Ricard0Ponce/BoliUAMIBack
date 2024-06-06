package uam.boligrama.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uam.boligrama.models.Materia;
import uam.boligrama.services.MateriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/lista")
    public List<Materia> getListaMaterias() {
        return materiaService.findAll();
    }

    // Un ejemplo de como usar el endpoint es: 
    // http://localhost:8080/materias/materia/1
    @GetMapping("/materia/{id}")
    public Materia getMateria(@PathVariable Long id) {
        return materiaService.findById(id);
    }
    

}
