package com.informatorio.demo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class EmpleadoJornada extends Empleado{

    private BigDecimal sueldoXHoraTrabajada;

    public BigDecimal getSueldoXHoraTrabajada() {
        return sueldoXHoraTrabajada;
    }

    public void setSueldoXHoraTrabajada(BigDecimal sueldoXHoraTrabajada) {
        this.sueldoXHoraTrabajada = sueldoXHoraTrabajada;
    }
}
