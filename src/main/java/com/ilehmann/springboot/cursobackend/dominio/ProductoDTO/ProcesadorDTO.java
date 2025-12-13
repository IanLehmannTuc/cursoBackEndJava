package com.ilehmann.springboot.cursobackend.dominio.ProductoDTO;

import lombok.Data;

@Data
public class ProcesadorDTO extends ProductoDTO {
    private int nucleos;
    private int hilos;
    private double frecuenciaBase;
    private String socket;
    private int wattsNecesarios;
    private boolean graficaIntegrada;
}
