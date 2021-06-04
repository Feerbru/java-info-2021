/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
*/
package Ejercicios.EjerciciosComp2.Ejercicio5;

public class Program {
    public static void main(String[] args) {
        
        Integer [] horas = {6,7,4,8,9};
        Empleado empleado = new Empleado("Lucas", horas);

        System.out.println(empleado.getListaHorasTrab());
    }
}
        