package Ejercicios.PracticaGuiada;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el primer numero: ");
        int nro1 = entrada.nextInt();
        System.out.println("Por favor ingrese el segundo numero: ");
        int nro2 = entrada.nextInt();
        System.out.println("Por favor ingrese el tercer numero: ");
        int nro3 = entrada.nextInt();

        System.out.println("El primer nro ingresado es: " + nro1 + 
                           "\nEl segundo nro ingresado es: " + nro2 +
                           "\nEl tercer nro ingresado es: " + nro3);
    
        entrada.close();
    }
}
