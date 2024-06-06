package uam.boligrama.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import uam.boligrama.models.Materia;
import uam.boligrama.repositories.MateriaRepository;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Qualifier("materiasJson") // Estamos inyectando el Json
    @Autowired
    private MateriaRepository materiaRepository;



    @Override
    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia findById(Long id) {
        return materiaRepository.findById(id);
    }

}
