package udla.arcane.jpa.controladores;

import udla.arcane.jpa.modelos.Organizacion;
import udla.arcane.jpa.repositorios.OrganizacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/organizaciones")
public class OrganizacionController {

    private final OrganizacionRepository repository;

    public OrganizacionController(OrganizacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Organizacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Organizacion create(@RequestBody Organizacion organizacion) {
        return repository.save(organizacion);
    }

    @GetMapping("/{id}")
    public Optional<Organizacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
