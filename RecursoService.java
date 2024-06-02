package repository;

import com.example.demo.model.Recurso;
import com.example.demo.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> findByNome(String nome) {
        return recursoRepository.findByNome(nome);
    }
}
    