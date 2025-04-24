package udla.arcane.jpa.modelos;

import jakarta.persistence.*;

@Entity
public class Relacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_personaje_a")
    private Personaje personajeA;

    @ManyToOne
    @JoinColumn(name = "id_personaje_b")
    private Personaje personajeB;

    private String tipoRelacion;

    protected Relacion() {}

    public Relacion(Personaje personajeA, Personaje personajeB, String tipoRelacion) {
        this.personajeA = personajeA;
        this.personajeB = personajeB;
        this.tipoRelacion = tipoRelacion;
    }

    public Long getId() {
        return id;
    }

    public Personaje getPersonajeA() {
        return personajeA;
    }
    public void setPersonajeA(Personaje personajeA) {
        this.personajeA = personajeA;
    }
    public Personaje getPersonajeB() {
        return personajeB;
    }
    public void setPersonajeB(Personaje personajeB) {
        this.personajeB = personajeB;
    }
    public String getTipoRelacion() {
        return tipoRelacion;
    }
    public void setTipoRelacion(String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    @Override
    public String toString() {
        return String.format(
                "Relación:\n  ID: %d\n  Personaje A: %s\n  Personaje B: %s\n  Tipo de relación: %s",
                id, personajeA.getNombre(), personajeB.getNombre(), tipoRelacion
        );
    }
}
