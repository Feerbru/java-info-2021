/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).
*/
package Ejercicios.EjerciciosComp2.Ejercicio2;

import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> listaInt = new ArrayList<>();
        int tamInicial = 0;
        int tamFinal = 0;

        for (int i = 0; i < 5; i++) {
            listaInt.add((int)(Math.random()*20));
        }
        tamInicial = listaInt.size();
        //System.out.println(tamInicial);

        listaInt.add(0 , 12);
        listaInt.add((tamInicial + 1) , 12);

        for (Integer val : listaInt) {
            System.out.print(val + " ");
        }
        tamFinal = listaInt.size();

        System.out.println("\nTamaño inicial es: " + tamInicial + 
                            "\nTamaño final es: " + tamFinal);

    }
}
