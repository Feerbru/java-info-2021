/*Debemos realizar un programa que nos realizará una pregunta si queremos realizar una
operación dada o si deseamos salir/terminar el programa.
Utilizaremos en este caso una simple operación que nos pide un número y luego lo
imprime.
*/
package Ejercicios.PracticaGuiada;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int seguir,nro;

        do {
            System.out.println("Por favor ingrese un numero para imprimirlo por pantalla:");
            nro = scan.nextInt();
            System.out.println("Su numero es: " + nro);

            System.out.println("Desea Continuar --> presione 1\n" +
                               "De lo contrario presione cualquier numero para terminar el programa!!!");
            seguir = scan.nextInt();
        } while (seguir == 1);
        scan.close();
    }
}
