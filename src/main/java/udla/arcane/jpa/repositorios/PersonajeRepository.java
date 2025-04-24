package udla.arcane.jpa.repositorios;

import udla.arcane.jpa.modelos.Personaje;
import org.springframework.data.repository.CrudRepository;

public interface PersonajeRepository extends CrudRepository<Personaje, Long> {
}
