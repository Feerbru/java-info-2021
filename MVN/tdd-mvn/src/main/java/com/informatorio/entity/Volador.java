package com.informatorio.entity;

import com.exception.HeroeException;

public interface Volador {
    
    public Integer elevarse(Integer desplazamiento, Integer velocidad) throws HeroeException;
}
