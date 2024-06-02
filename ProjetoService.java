package repository;

import com.example.demo.model.Projeto;
import com.example.demo.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> findByDescricao(String descricao) {
        return projetoRepository.findByDescricao(descricao);
    }
}
