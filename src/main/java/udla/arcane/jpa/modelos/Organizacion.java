package udla.arcane.jpa.modelos;

import jakarta.persistence.*;

@Entity
public class Organizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_organizacion;

    private String nombre;
    private String ciudadBase;
    private String tipo;

    protected Organizacion() {}

    public Organizacion(String nombre, String ciudadBase, String tipo) {
        this.nombre = nombre;
        this.ciudadBase = ciudadBase;
        this.tipo = tipo;
    }


    public Long getId_organizacion() {
        return id_organizacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudadBase() {
        return ciudadBase;
    }
    public void setCiudadBase(String ciudadBase) {
        this.ciudadBase = ciudadBase;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format(
                "Organización:\n  ID: %d\n  Nombre: %s\n  Ciudad base: %s\n  Tipo: %s",
                id_organizacion, nombre, ciudadBase, tipo
        );
    }
}
