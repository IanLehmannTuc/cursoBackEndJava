package com.ilehmann.springboot.cursobackend.dominio.ProductoDTO;

import com.ilehmann.springboot.cursobackend.dominio.Mother;
import com.ilehmann.springboot.cursobackend.dominio.Procesador;
import com.ilehmann.springboot.cursobackend.dominio.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {
    public ProductoDTO toDTO(Producto entity) {
        ProductoDTO dto = null;

        if (entity instanceof Procesador) {
            Procesador p = (Procesador) entity;
            ProcesadorDTO pDto = new ProcesadorDTO();
            pDto.setNucleos(p.getNucleos());
            pDto.setHilos(p.getHilos());
            pDto.setFrecuenciaBase(p.getFrecuenciaBase());
            pDto.setSocket(p.getSocket());
            pDto.setWattsNecesarios(p.getWattsNecesarios());
            pDto.setGraficaIntegrada(p.isGraficaIntegrada());
            pDto.setTipoProducto("Procesador");
            dto = pDto;
        } else if (entity instanceof Mother) {
            Mother m = (Mother) entity;
            MotherboardDTO mDto = new MotherboardDTO();
            mDto.setSocket(m.getSocket());
            mDto.setFactorForma(m.getFactorForma());
            mDto.setChipset(m.getChipset());
            mDto.setTipoMemoria(m.getTipoMemoria());
            mDto.setCantidadSlotsRam(m.getCantidadSlotsRam());
            mDto.setWifi(m.isWifi());
            mDto.setCantidadM2(m.getCantidadM2());
            mDto.setTipoProducto("Motherboard");
            dto = mDto;
        } else {
            dto = new ProductoDTO();
            dto.setTipoProducto("Genérico");
        }

        dto.setIdProducto(entity.getIdProducto());
        dto.setNombre(entity.getNombre());
        dto.setDescripcion(entity.getDescripcion());
        dto.setPrecioSinIva(entity.getPrecioSinIva());

        if (entity.getMarca() != null) {
            dto.setNombreMarca(entity.getMarca().getNombre());
        }

        return dto;
    }
}
