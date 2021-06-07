
/*Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
*/


public class Ejercicio7 {
    public static void main(String[] args) {

        String [] cadenaStr = secuenciasNros(1, 10);

        for (int i = 0; i < cadenaStr.length; i++) {
            System.out.print(cadenaStr[i]);
        }
    }
    public static String [] secuenciasNros(int inicio , int fin){
        int lon = fin - inicio;
        String [] cadena = new String[lon];

        for (int i = 0; i < cadena.length; i++) {
            
            if(inicio % 2 == 0 && inicio % 3 == 0){
                cadena[i] = "FizzBuzz, ";
            }else if(inicio % 3 == 0){
                cadena[i] = "Buzz, ";
            }else if(inicio % 2 == 0){
                cadena[i] = "Fizz, ";
            }else{
                cadena[i] = (inicio + ", ");
            }

            inicio++;
        }

        return cadena;
    }
}
