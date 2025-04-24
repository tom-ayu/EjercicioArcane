package udla.arcane.jpa.controladores;

import udla.arcane.jpa.modelos.UsoTecnologia;
import udla.arcane.jpa.repositorios.UsoTecnologiaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usos-tecnologia")
public class UsoTecnologiaController {

    private final UsoTecnologiaRepository repository;

    public UsoTecnologiaController(UsoTecnologiaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<UsoTecnologia> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public UsoTecnologia create(@RequestBody UsoTecnologia usoTecnologia) {
        return repository.save(usoTecnologia);
    }

    @GetMapping("/{id}")
    public Optional<UsoTecnologia> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
