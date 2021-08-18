/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
*/
package Ejercicios.EjerciciosComp2.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
    public static void main(String[] args) {

        String [] nombres =  {"Fernando","Julio","Leo","Maria","Sonia","Gonzalo","Pablo","Nicolas","Ely","Juan","Andrea","Fabian"};
        List<String> estudiantes = new ArrayList<>(Arrays.asList(nombres));

        //separamos los estudiantes en 3 cursos
        List<String> curso1 = new ArrayList<>(estudiantes.subList(0, 3));
        List<String> curso2 = new ArrayList<>(estudiantes.subList(4, 7));
        List<String> curso3 = new ArrayList<>(estudiantes.subList(8, 11));

        //Imprimo los cursos
        imprimir(curso1, 1);
        imprimir(curso2, 2);
        imprimir(curso3, 3);

    }
    
    public static void imprimir(List<String> list, int curso){
        System.out.println("Estudiante del curso " + curso);

        for (String string : list) {
            System.out.println(string);
        }
    }
}
