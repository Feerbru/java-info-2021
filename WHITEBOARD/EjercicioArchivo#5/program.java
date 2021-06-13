
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class program {
    public static void main(String[] args) throws IOException {
        String archivo = "D:\\Informatorio\\Modulo 3\\Java\\Proyectos\\Informatorio-Java2021\\java-info-2021\\WHITEBOARD\\EjercicioArchivo#5\\archivo.txt";

        leerArchivo(archivo);
    }
    public static void leerArchivo(String archivo) throws FileNotFoundException, IOException{
        String texto;
        String [] persona;
        List<Persona> listPersonas = new ArrayList<>();
        FileReader fR = new FileReader(archivo);
        BufferedReader bR = new BufferedReader(fR);

        while((texto = bR.readLine()) != null){
            
            persona = texto.split(",");
            listPersonas.add(new Persona(persona[0],persona[1],persona[2],persona[3]));
        }
        for (Persona pers : listPersonas) {
            System.out.println(pers.getNombre());
        }
        bR.close();
    }

}
