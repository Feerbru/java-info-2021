package Ejercicios.PracticaGuiada;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int cont;

        do {
            System.out.println("Por favor ingrese el resultado de la evaluacion:");
            int nota = input.nextInt();
            EvaluarNota(nota);
            
            System.out.println("desea continuar con la operacion seleccione: \n" +
                                "1-Continuar\n" +
                                "2-Salir");
            cont = input.nextInt();
        } while (cont == 1);
        
        input.close();
    }

    public static void EvaluarNota(int nota){

        if (nota <= 100 && nota >= 93){
            System.out.println("Excelente");
        }else if(nota >= 85){
            System.out.println("Sobresaliente");
        }else if(nota >= 75){
            System.out.println("Distinguido");
        }else if(nota >= 60){
            System.out.println("Bueno");
        }else{
            System.out.println("Desaprobado");
        }
    }
}
