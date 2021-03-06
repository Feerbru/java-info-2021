package Ejercicios.EjerciciosComp1.Ejercicio4;

import java.util.Scanner;

public class Factorial {
    
    int factorial(int fact){
        if(fact > 0){
            return fact * factorial(fact - 1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Factorial fact = new Factorial();

        System.out.println("<--Bienvenidos-->\n"+
                            "por favor ingrese un numero:");
        int nro = scan.nextInt();

        int fa = fact.factorial(nro);
        System.out.println("El factorial de " + nro + " es: " + fa);
        scan.close();
    }
}
