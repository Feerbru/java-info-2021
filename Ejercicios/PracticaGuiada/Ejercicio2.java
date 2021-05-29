package Ejercicios.PracticaGuiada;

import java.util.Scanner;

public class Ejercicio2 {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int cont;

        do {
            System.out.println("<---BIENVENIDOS--->");
            int [] nrosImpr = ingreseNro();
            ImprimeNros(nrosImpr);
            System.out.println("desea continuar con la operacion seleccione: \n" +
                                "1-Continuar\n" +
                                "2-Salir");
            cont = entrada.nextInt();
            
        } while (cont == 1);
        entrada.close();

        /*
        int cont;

        do {
            System.out.println("Por favor ingrese el primer numero: ");
            int nro1 = entrada.nextInt();
            System.out.println("Por favor ingrese el segundo numero: ");
            int nro2 = entrada.nextInt();
            System.out.println("Por favor ingrese el tercer numero: ");
            int nro3 = entrada.nextInt();

            System.out.println("El primer nro ingresado es: " + nro1 + 
                            "\nEl segundo nro ingresado es: " + nro2 +
                            "\nEl tercer nro ingresado es: " + nro3);
            
            System.out.println("desea continuar con la operacion seleccione: \n" +
                                "1-Continuar\n" +
                                "2-Salir");
            cont = entrada.nextInt();
        } while (cont == 1);
        
    
        entrada.close();
        */
    }

    public static int [] ingreseNro(){

        System.out.println("ingrese la cantidad de numeros que desea ingresar:");
        int cant = entrada.nextInt();

        int [] arreglo = new int [cant];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el " + (i + 1) + " numero:");
            arreglo[i] = entrada.nextInt();
        }
        return arreglo;
    }

    public static void ImprimeNros(int [] arreglo){

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El " + (i + 1) + " ingresado es: " + arreglo[i]);
        }
    }
}
