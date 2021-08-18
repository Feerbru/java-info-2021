package Ejercicios.PracticaGuiada;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cont;
        
        do {
            System.out.println("Por favor ingrese un nro:");
            int nro = scan.nextInt();
            
            for(int i = 1; i <= 10; i++){
                System.out.println(nro + " x " + i + " = " + (nro * i ));
            }

            System.out.println("desea continuar con la operacion seleccione: \n" +
                                   "1-Continuar\n" +
                                   "2-Salir");
            cont = scan.nextInt(); 
        } while (cont == 1);
        
        scan.close();
    }
}
