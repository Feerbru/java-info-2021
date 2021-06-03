s/*Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/
package Ejercicios.EjerciciosComp1.Ejercicio8;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre:");
        persona.getNombre(scan.nextLine());

        System.out.println("Ingrese el apellido:");
        persona.getApellido(scan.nextLine());

        System.out.println("Ingrese su edad:");
        persona.getEdad(scan.nextInt());

        System.out.println("Ingrese su direccion:");
        persona.getDireccion(scan.nextLine());

        System.out.println("Ingrese su ciudad:");
        persona.getCiudad(scan.nextLine());

        System.out.println(persona.toString());

        scan.close();

    }
}
