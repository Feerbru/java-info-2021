public class Ejercicio2 {
    //Realizar una función que calcule el factorial de un número dado.
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
    public static int factorial(int fact){
        if(fact > 0){
            return fact * factorial(fact - 1);
        }else {
            return 1;
        }
    }
}
