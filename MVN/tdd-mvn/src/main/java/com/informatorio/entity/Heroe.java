package com.informatorio.entity;

import com.exception.HeroeException;

public class Heroe implements Volador{
    
    public Integer salud;
    public Integer fuerza;
    private String nombre;

    public Heroe(Integer salud, Integer fuerza){
        this.salud = salud;
        this.fuerza = fuerza;
    }
    public Heroe(){}

    @Override
    public Integer elevarse(Integer desplazamiento, Integer velocidad) throws HeroeException{

        return desplazamiento < 0 ? -1 : 1;
    }
}
