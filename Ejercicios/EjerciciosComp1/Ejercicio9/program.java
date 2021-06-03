/*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.
*/
package Ejercicios.EjerciciosComp1.Ejercicio9;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cadena de texto: ");
        String texto = scan.nextLine();
        System.out.println("ingrese la letra para comprobar cuantas veces aparece en el texto:");
        char a = scan.next().charAt(0);
        scan.close();

        calculaCantLetr(texto, a);
    }
    public static void calculaCantLetr(String cadena, char letra){

        int cantidad = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) &0x5f)  == letra || (cadena.charAt(i)| 0x20) == letra) {
                cantidad++;
            }
        }
        System.out.println(" La cantidad de veces que se repite la letras es: " + cantidad);
    }
}