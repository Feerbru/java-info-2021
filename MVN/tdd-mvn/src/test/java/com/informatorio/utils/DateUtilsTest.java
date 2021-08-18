package com.informatorio.utils;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import org.junit.Before;
import org.junit.Test;

public class DateUtilsTest {
    
    @Before
    public static void setUp(){
        
    }

    @Test
    public void cuando_ejecuto_hello_me_devuelve_el_saludo(){

        //GIVEN

        //WHEN

        //THEN
        assertEquals("Hola", DateUtils.hello());
    }

    @Test
    public void cuando_ejecuto_convertir_en_fecha_valida_me_retorna_localdate_valido(){

        //GIVEN
        String fechaValida = "23/07/2014";
        //WHEN
        LocalDate fecha = DateUtils.convertirStringAFecha(fechaValida);
        //THEN
        assertEquals(LocalDate.of(2014, 07, 23) , fecha);
    }

    @Test(expected = DateTimeParseException.class)
    public void cuando_ejecuto_convertir_en_fecha_valida_me_retorna_arroja_exception(){

        //GIVEN
        String fechaValida = "88/07/2014";
        //WHEN
        LocalDate fecha = DateUtils.convertirStringAFecha(fechaValida);
        //THEN
    }

    @Test
    public void cuando_calculo_una_fecha_valida_me_retorna_la_edad(){

        //GIVEN
        LocalDate fecha1 = LocalDate.of(2014, 07, 23);
        //WHEN
        Integer edad = DateUtils.calcularEdad(fecha1);
        //THEN
        assertEquals(Integer.valueOf(6) , edad);
    }
}
