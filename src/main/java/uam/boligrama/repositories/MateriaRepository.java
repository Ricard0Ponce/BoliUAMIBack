package uam.boligrama.repositories;

import java.util.List;

import uam.boligrama.models.Materia;

public interface MateriaRepository {
    List<Materia> findAll();
    Materia findById(Long id);
}
