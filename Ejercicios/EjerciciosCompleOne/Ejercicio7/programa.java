/*Realizar un Programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().
*/
package Ejercicios.EjerciciosCompleOne.Ejercicio7;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        StringBuilder cadena = new StringBuilder();
        String texto;

        //para mayuscula = 'a' & 0x5f;
        //para minuscula = 'B' | 0x20;

        System.out.println("Bienvenidos\n" +
                           "Ingrese el texto para pasar a mayuscula:");
        texto = scan.nextLine();
        
        //recorro con un for el string, y transformo cada posicion en char. Para luego comprobar
        //si no es un caracter especial. Luego realizo un and al caracter con el numero en hexa "0x5f"
        //para luego parsear y almacenar. luego agrego el caracter al stringBuilder.

        for (int i = 0; i < texto.length(); i++) {
            char aux = texto.charAt(i);

            if(aux != ' ' && aux != '!' && aux != '¡' && aux != '¿' && aux != '?' && aux != '.' && aux != ','){

                aux = (char) (aux & 0x5f);
                cadena.append(aux);
            }else{
                switch (aux) {
                    case ' ': cadena.append(' ');
                        break;
                    case '!': cadena.append('!');
                        break;
                    case '¡': cadena.append('¡');
                        break;
                    case '¿': cadena.append('¿');
                        break;
                    case '?': cadena.append('?');
                        break;
                    case '.': cadena.append('.');
                        break;
                    case ',': cadena.append(',');
                        break;
                }  
            }
        }

        System.out.println(cadena);
        scan.close();
    }
}
