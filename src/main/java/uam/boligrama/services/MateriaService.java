package uam.boligrama.services;

import java.util.List;

import uam.boligrama.models.Materia;

public interface MateriaService {
    List<Materia> findAll();
    Materia findById(Long id);
}
