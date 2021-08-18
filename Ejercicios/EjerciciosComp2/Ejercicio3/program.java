/*Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras -13 valores). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.
*/
package Ejercicios.EjerciciosComp2.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program {
    public static void main(String[] args) {
        
        List<Integer> baraja = new ArrayList<>();

        //cargo los valores de la baraja francesa en forma ordenada
        for (int i = 0; i < 13; i++) {
            baraja.add((i + 1));
        }

        System.out.println("Ordenado");
        for (Integer bar : baraja) {
            System.out.print(bar + " ");
        }

        //reverso con un metodo de colleciones
        Collections.reverse(baraja);

        System.out.println("\nReverso");
        for (Integer bar : baraja) {
            System.out.print(bar + " ");
        }

        //desordeno con un metodo de colleciones
        Collections.shuffle(baraja);

        System.out.println("\nDesordenado");
        for (Integer bar : baraja) {
            System.out.print(bar + " ");
        }

    }
}
