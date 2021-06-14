import java.io.*;
import java.time.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws IOException {

        String archivoWindows = "D:\\Informatorio\\Modulo 3\\Java\\Proyectos\\Informatorio-Java2021\\java-info-2021\\WHITEBOARD\\EjercicioArchivo#5\\archivo.txt";
        //String archivoLinux = "/media/feerbru/Disco local/Informatorio/Proyectos/java-info-2021/WHITEBOARD/EjercicioArchivo#5/archivo.txt";
        Scanner scan = new Scanner(System.in);

        //Abrimos el archivo txt y cargamos la lista de con objetos de personas.
        List<Persona> personas = cargarLista(archivoWindows);

        //Imprimimos por pantalla y pedimos al usuario a que ingrese una letra para buscar en la lista por appellido.
        System.out.println("BUSCA EN LA LISTA POR LETRA INGRESADA");
        System.out.println("INGRESE LA LETRA:");
        char c =  scan.next().charAt(0);
        List<Persona> listaNuevaEmple = buscarPorApellido(personas, c );
        imprimir(listaNuevaEmple);

        //Calculamos el empleado mas joven y el mas viejo en la lista
        System.out.println("CALCULA EL EMPLEADO MAS JOVEN Y VIEJO DE LA EMPRESA");
        calcularAñoEmpleado(personas);

        //Calculamos el sueldo mas bajo y el mas alto de los empleados
        System.out.println("CALCULA EL SUELDO MAS BAJO Y MAS ALTO DE LA EMPRESA");
        calcularSueldo(personas);

        //Ordena la lista por nombre y apellido
        List<Persona> listaOrdenada = ordenarLista(personas);
        System.out.println("ORDENA POR NOMBRE Y LUEGO POR APELLIDO");
        imprimir(listaOrdenada);
        
        scan.close();
        
    }
    public static List<Persona> cargarLista(String archivo) throws FileNotFoundException, IOException{
        String texto;
        String [] persona;
        List<Persona> listaPersonas = new ArrayList<>();
        FileReader fR = new FileReader(archivo);
        BufferedReader bR = new BufferedReader(fR);

        while((texto = bR.readLine()) != null){
            
            persona = texto.split(",");
            listaPersonas.add(new Persona(persona[0],persona[1],persona[2],persona[3]));
        }
        bR.close();

        return listaPersonas;
    }
    
    //Método que devuelva todos los empleados que comienzan con una letra dada en el apellido.
    public static List<Persona> buscarPorApellido(List<Persona> lista, char letra){

        List<Persona> listaNueva = new ArrayList<>();

        for (Persona persona : lista) {

            String apellido = persona.getApellido();

            if(letra == apellido.charAt(0)){
                listaNueva.add(persona);
            }
        }

        return listaNueva;
    }
    
    //Método que devuelva el empleado más joven y el más viejo (necesito una funcion para calcular el año basado en una fecha)
    public static void calcularAñoEmpleado(List<Persona> listaPersona){

        listaPersona.sort(Comparator.comparing(Persona::getFecha));

        System.out.println("Empleado mas joven en la empresa es: " + listaPersona.get(listaPersona.size() -1).toString() + "\nEmpleado mas viejo es: " + listaPersona.get(0).toString());

    }
    public static long sacarDiferenciaDias(LocalDate dia1, LocalDate dia2){
        
        Duration dif = Duration.between(dia1.atStartOfDay(), dia2.atStartOfDay());
        return dif.toDays();
    }

    //El empleado que más gana y el que menos gana.
    public static void calcularSueldo(List<Persona> listaPersona){

        BigDecimal sueldo = new BigDecimal(0);
        int indiceMayor = 0, indiceMenor = 0;

        
        for (int i = 0; i < listaPersona.size(); i++) {
            
            if (listaPersona.get(i).getSueldo().compareTo(sueldo) > 0) {
                sueldo = listaPersona.get(i).getSueldo();
                indiceMayor = i;
            }else{
                indiceMenor = i;
            }
        }
        System.out.println("El sueldo mas alto es: " + listaPersona.get(indiceMayor).toString() + "\nEl sueldo mas bajo: " + listaPersona.get(indiceMenor).toString());
    }

    //Imprimir la lista 
    public static void imprimir(List<Persona> listaPersona){

        for (Persona persona : listaPersona) {
            System.out.println(persona.toString());
        }
    }

    //Imprimir todos los empleados en orden alfabético (por nombre y por apellido).
    public static List<Persona> ordenarLista(List<Persona> lista){
        lista.sort(Comparator.comparing(Persona::getNombre).thenComparing(Persona::getApellido));
        return lista;
    }
}
