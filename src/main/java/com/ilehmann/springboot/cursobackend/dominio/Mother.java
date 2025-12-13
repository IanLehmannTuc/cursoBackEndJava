package com.ilehmann.springboot.cursobackend.dominio;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Mother extends Producto{
    private String socket;
    private String factorForma;
    private String chipset;
    private String tipoMemoria;
    private int cantidadSlotsRam;
    private boolean wifi;
    private int cantidadM2;

    public Mother() {
    }

    public Mother(String nombre, Marca marca, String descripcion, double precioSinIva, String socket, String factorForma, String chipset, String tipoMemoria, boolean wifi, int cantidadSlotsRam, int cantidadM2) {
        super(nombre, marca, descripcion, precioSinIva);
        this.socket = socket;
        this.factorForma = factorForma;
        this.chipset = chipset;
        this.tipoMemoria = tipoMemoria;
        this.wifi = wifi;
        this.cantidadSlotsRam = cantidadSlotsRam;
        this.cantidadM2 = cantidadM2;
    }
}
