package Ejercicios.EjerciciosComp2.Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empleado {
    
    private String nombre;
    private List<Integer> listaHorasTrab;


    public Empleado(String nombre, Integer [] horas){
        this.nombre = nombre;
        this.listaHorasTrab = new ArrayList<>(Arrays.asList(horas)); 
    };

    public String getNombre(){
        return this.nombre;
    }

    public List<Integer> getListaHorasTrab(){
        return this.listaHorasTrab;
    }
    
    
}
