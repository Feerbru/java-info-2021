package Ejercicios.RepasoOPP;

public class Empleado {
    
    int edad;
    String nombre;
    String apellido;

    public Empleado(int edad, String nombre, String apellido){
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return String.valueOf(edad) +
        " - " + this.nombre + " - " + this.apellido;
    }
}
