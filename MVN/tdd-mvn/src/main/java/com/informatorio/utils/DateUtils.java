package com.informatorio.utils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.exception.HeroeException;
import com.informatorio.entity.Heroe;

public class DateUtils {
    
    private static String HOLA = "Hola";

    public static String hello(){
        return HOLA;
    }

    public static LocalDate convertirStringAFecha(String fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(fecha, formatter);
    }

    public static Integer calcularEdad(LocalDate fechaNac){
        LocalDate now = LocalDate.now();
        return null;
    }

    public static Integer crearHeroeYVuele() throws HeroeException{
        Heroe heroe = new Heroe(1, 2);
        heroe.elevarse(2, 4);
        return null;
    }
}


