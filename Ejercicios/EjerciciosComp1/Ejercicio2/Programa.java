/*Realizar un programa que solicite por consola 2 números enteros. Para luego
**imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
**de la división) de ambos números.
*/
package Ejercicios.EjerciciosComp1.Ejercicio2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el primer numero:");
        int nro1 = scan.nextInt();
        System.out.println("Por favor ingrese el segundo numero:");
        int nro2 = scan.nextInt();

        Calculadora calcu = new Calculadora(nro1, nro2);
        calcu.suma();
        calcu.resta();
        calcu.multiplicacion();
        calcu.division();
        calcu.mod();
        scan.close();
    }
}
