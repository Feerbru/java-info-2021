package com.informatorio.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServicioSaludoTest {
    
    private static final String CARLOS = "Carlos";

    @Test
    public void cuando_se_pasa_un_nombre_el_servicio_saluda_correctamente(){
        
        //GIVEN - dado

        //WHEN - cuando

        //THEN - entonces
        assertEquals("Hola Carlos!!", ServicioSaludo.saludoPersona(CARLOS));
    }

    @Test
    public void cuando_se_pasa_un_nombre_nulo_el_servicio_saluda_hola(){
        
        //GIVEN - dado

        //WHEN - cuando
        
        //THEN - entonces
        assertEquals("Hola!!", ServicioSaludo.saludoPersona(null));
    }

    @Test
    public void cuando_se_pasa_un_nombre_con_blancos_el_servicio_saluda_por_defecto(){
        
        //GIVEN - dado

        //WHEN - cuando
        
        //THEN - entonces
        assertEquals("Hola!!", ServicioSaludo.saludoPersona("    "));
    }
}
