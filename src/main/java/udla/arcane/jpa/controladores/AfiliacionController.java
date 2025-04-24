package udla.arcane.jpa.controladores;

import udla.arcane.jpa.modelos.Afiliacion;
import udla.arcane.jpa.repositorios.AfiliacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/afiliaciones")
public class AfiliacionController {

    private final AfiliacionRepository repository;

    public AfiliacionController(AfiliacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Afiliacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Afiliacion create(@RequestBody Afiliacion afiliacion) {
        return repository.save(afiliacion);
    }

    @GetMapping("/{id}")
    public Optional<Afiliacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
