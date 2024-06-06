package uam.boligrama;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import uam.boligrama.repositories.MateriaRepository;
import uam.boligrama.repositories.MateriaRepositoryJson;

@Configuration
public class AppConfig {

    @Value("classpath:json/materias.json")
    private Resource materiasJson;
    //NOTA: MAPEADO HASTA LA MATERIA 104
    @Bean("materiasJson")
    public MateriaRepository materiasRepositoryJson ()  throws IOException{
        return new MateriaRepositoryJson(materiasJson);
    }

}
