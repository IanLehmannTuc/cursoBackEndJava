package com.ilehmann.springboot.cursobackend.dominio;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Procesador extends Producto{

    private int nucleos;
    private int hilos;
    private double frecuenciaBase;
    private String socket;
    private int wattsNecesarios;
    private boolean graficaIntegrada;

    public Procesador() {
    }

    public Procesador(String nombre,Marca marca, String descripcion, double precioSinIva, int nucleos, int hilos, double frecuenciaBase, String socket, int wattsNecesarios, boolean graficaIntegrada) {
        super(nombre, marca, descripcion, precioSinIva);
        this.nucleos = nucleos;
        this.hilos = hilos;
        this.frecuenciaBase = frecuenciaBase;
        this.socket = socket;
        this.wattsNecesarios = wattsNecesarios;
        this.graficaIntegrada = graficaIntegrada;
    }
}
