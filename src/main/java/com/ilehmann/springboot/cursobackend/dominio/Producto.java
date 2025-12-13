package com.ilehmann.springboot.cursobackend.dominio;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public abstract class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idMarca")
    private Marca marca;

    private String descripcion;
    private int stock;
    private double precioSinIva;

    public Producto() {
    }

    public Producto(String nombre, Marca marca, String descripcion, double precioSinIva) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precioSinIva = precioSinIva;
    }

    @PrePersist
    public void prePersist() {
        this.stock = 0;
    }
}
