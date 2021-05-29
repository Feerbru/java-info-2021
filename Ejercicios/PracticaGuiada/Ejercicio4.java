package Ejercicios.PracticaGuiada;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int cont;
        
        do {
                System.out.println("Por favor ingrese un numero:");
                int dia = input.nextInt();
                EvaluarDias(dia);
                
                System.out.println("desea continuar con la operacion seleccione: \n" +
                                   "1-Continuar\n" +
                                   "2-Salir");
                cont = input.nextInt();  
        } while (cont == 1);

        input.close();
    }
    public static void EvaluarDias(int dias){

        switch (dias) {
                case 1:System.out.println("Lunes"); 
                        break;
                case 2:System.out.println("Martes"); 
                        break;
                case 3:System.out.println("Miercoles");
                        break;
                case 4:System.out.println("Jueves"); 
                        break;
                case 5:System.out.println("Viernes"); 
                        break;
                case 6:System.out.println("Sabado"); 
                        break;
                case 7:System.out.println("Domingo"); 
                        break;
            
                default:
                    System.out.println("No correspone a un dia de la semana");
                    break;
        }
    }
}
