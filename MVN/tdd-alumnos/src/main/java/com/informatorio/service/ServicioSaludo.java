package com.informatorio.service;

/**
 * Si le pasamos el nombre Carlos, nos devuelve Hola Carlos
 */
public class ServicioSaludo {
    
    private static final String PREFIJO_SALUDO = "Hola ";
    private static final String SUFIJO_SALUDO = "!!";

    public static String saludoPersona(String nombre){
        
        return (nombre != null && !nombre.trim().isEmpty()) ?  PREFIJO_SALUDO + nombre + SUFIJO_SALUDO : PREFIJO_SALUDO.trim() + SUFIJO_SALUDO;
    }


}
