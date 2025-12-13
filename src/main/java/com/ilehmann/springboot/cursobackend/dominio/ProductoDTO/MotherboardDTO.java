package com.ilehmann.springboot.cursobackend.dominio.ProductoDTO;

import lombok.Data;

@Data
public class MotherboardDTO extends ProductoDTO {
    private String socket;
    private String factorForma;
    private String chipset;
    private String tipoMemoria;
    private int cantidadSlotsRam;
    private boolean wifi;
    private int cantidadM2;
}
