/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).
*/
package Ejercicios.EjerciciosCompleOne.Ejercicio6;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1, val2, resul;

        System.out.println("<--Bienvenidos-->\n" +
                            "Ingrese el primer numero:");
        val1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero:");
        val2 = scan.nextInt();

        resul = potencia(val1, val2);


        System.out.println(val1 + " elevado a " + val2 + " = " + resul);
        scan.close();
    }

    public static int potencia(int nro, int nro2){
        int resultado = nro;
        while (nro2 > 1) {
            resultado *= nro;
            nro2--;
        }
        return resultado;
    }
}

        
