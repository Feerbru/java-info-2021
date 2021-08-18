import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        
        String patch = "D:\\Informatorio\\Modulo 3\\Java\\Proyectos\\Informatorio-Java2021\\java-info-2021\\Ejercicios\\EjerciciosEnClases\\Ejercicio3-Clase\\personas.txt";

        leerArchivo(patch);

    }

    public static void leerArchivo(String patch) throws IOException{

        String personas;
        FileReader fr = new FileReader(patch);
        BufferedReader br = new BufferedReader(fr);

        while ((personas = br.readLine()) != null) {
            System.out.println(personas);
        }
        br.close();
    }
}
