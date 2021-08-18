package Ejercicios.EjerciciosComp1.Ejercicio8;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String ciudad;

    public Persona(){}

    public void getNombre(String nom){
        this.nombre = nom;
    }
    public void getApellido(String ape){
        this.apellido = ape;
    }
    public void getEdad(int ed){
        this.edad = ed;
    }
    public void getDireccion(String direc){
        this.direccion = direc;
    }
    public void getCiudad(String ciu){
        this.ciudad = ciu;
    }
    @Override
    public String toString() {
        return ciudad + " - " + direccion + " - " + String.valueOf(edad) + " - " + nombre + " " + apellido;
    }
}