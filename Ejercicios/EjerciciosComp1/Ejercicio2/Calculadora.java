package Ejercicios.EjerciciosComp1.Ejercicio2;

public class Calculadora {
    
    private int nro1;
    private int nro2;

    public Calculadora(int nro1, int nro2){
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public void suma() {System.out.println(nro1 + " + " + nro2 + " = " + (nro1 + nro2));}
    public void resta() {System.out.println(nro1 + " - " + nro2 + " = " + (nro1 - nro2));}
    public void multiplicacion() {System.out.println(nro1 + " x " + nro2 + " = " + (nro1 * nro2));}
    public void division() {System.out.println(nro1 + " / " + nro2 + " = " + (nro1 / nro2));}
    public void mod() {System.out.println(nro1 + " % " + nro2 + " = " + (nro1 % nro2));}
}
