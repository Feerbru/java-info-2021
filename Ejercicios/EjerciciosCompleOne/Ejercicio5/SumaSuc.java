/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).
*/
package Ejercicios.EjerciciosCompleOne.Ejercicio5;

import java.util.Scanner;

public class SumaSuc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor1, valor2, resultado;

        System.out.println("<--Bienvenidos-->\n" +
                            "Ingrese el primer numero:");
        valor1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero:");
        valor2 = scan.nextInt();

        resultado = suma(valor1, valor2);


        System.out.println(valor1 + " x " + valor2 + " = " + resultado);
        scan.close();
    }

    public static int suma(int nro, int nro2){
        int resultado = 0;
        while (nro2 > 0) {
            resultado += nro;
            nro2--;
        }
        return resultado;
    }
}
