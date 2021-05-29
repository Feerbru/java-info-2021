/*Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma:
*/
package Ejercicios.EjerciciosCompleOne.Ejercicio3;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<--Bienvenidos-->\n"+
                            "Ingrese un numero:");
        int nro = scan.nextInt();
        piramide(nro);
        scan.close();
    }

    public static void piramide(int nro){
        StringBuilder print = new StringBuilder();

        for (int i = 1; i <= nro; i++) {
            print.append(String.valueOf(i) + " ");
            System.out.print(print + "\n");
        }
    }
}
