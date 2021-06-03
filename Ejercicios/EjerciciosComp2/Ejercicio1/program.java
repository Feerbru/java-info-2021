/*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking
*/
package Ejercicios.EjerciciosComp2.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Ciudades = new ArrayList<>();
        int salir = 0;

        do {
            System.out.println("<--BIENVENIDOS-->");
            System.out.print("Ingrese una ciudad de Argentina: ");
            Ciudades.add(scan.nextLine());

            System.out.println("¿Desea seguir cargando ciudades?\n"+
                                "1- Seguir.\n"+
                                "2- Salir.");
            salir = scan.nextInt();
        } while (salir != 2);

        System.out.println("<--RANKING-->");
        for (int i = 0; i < Ciudades.size(); i ++) {
            System.out.println("#" + (i + 1) + " - " + Ciudades.get(i));
        }

        scan.close();
    }
}
