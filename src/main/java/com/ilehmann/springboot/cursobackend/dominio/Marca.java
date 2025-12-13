package com.ilehmann.springboot.cursobackend.dominio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMarca;
    private String nombre;
    private boolean activa = true;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "marca_categorias", joinColumns = @JoinColumn(name = "marca_id"))
    @Column(name = "categoria")
    private Set<String> categoriasDisponibles;

    public Marca() {
    }

    public Marca(Long idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public Long getIdMarca() {
        return idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
