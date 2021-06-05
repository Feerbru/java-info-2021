/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
*/
package Ejercicios.EjerciciosComp2.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        String nombre = "Julio";
        int total = 0;
        String [] diasLaborables = {"Lunes","Martes","Miercoles","jueves","viernes"};
        Integer [] horasTrab = {5,4,9,4,10};
        Integer [] valorPorHora = {12,12,12,12,12};

        List<Integer> listaHT = new ArrayList<>();
        List<Integer> listaHPV = new ArrayList<>();
        List<Integer> listaTot = new ArrayList<>();

        cargarLista(listaHT, horasTrab);
        cargarLista(listaHPV, valorPorHora);
        listaTot = totalesAPagar(listaHT, listaHPV);

        //imprimimos las horas trabajadas
        System.out.println("Las horas trabajadas de " + nombre + " durante la semana son:");
        for (int i = 0; i < listaHT.size(); i++) {
            System.out.println(diasLaborables[i] + ":" + listaHT.get(i)  + "hs.");
        }

        //imprimimos el total a pagar por dia
        System.out.println("\nEl total a pagar por dia es:");
        for (int i = 0; i < listaTot.size(); i++) {
            System.out.println(diasLaborables[i] + ":$" + listaTot.get(i));
        }

        //sumamos el total a pagar a la semana
        for (int i = 0; i < listaTot.size(); i++) {
            total += listaTot.get(i);
        }

        System.out.println("\nEl total a liquidar semanalmente es:$" + total);
    }

    public static void cargarLista(List<Integer> lista, Integer [] array){
        for (int i = 0; i < array.length; i++) {
            lista.add(array[i]);
        }
    }
    public static List<Integer> totalesAPagar(List<Integer> lista1 , List<Integer> lista2){

        List<Integer> listaAux = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            listaAux.add(lista1.get(i) * lista2.get(i));
        }

        return listaAux;
    }
}
