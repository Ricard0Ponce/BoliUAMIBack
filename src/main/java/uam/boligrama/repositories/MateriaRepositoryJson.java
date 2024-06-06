package uam.boligrama.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import uam.boligrama.models.Materia;

public class MateriaRepositoryJson implements MateriaRepository {

    private List<Materia> lista;

    public MateriaRepositoryJson(Resource resource) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        lista = Arrays.asList(mapper.readValue(resource.getInputStream(), Materia[].class));
    }

    @Override
    public List<Materia> findAll() {
        return lista;
    }

    @Override
    public Materia findById(Long id) {
        return lista.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }

    
    
    
}
