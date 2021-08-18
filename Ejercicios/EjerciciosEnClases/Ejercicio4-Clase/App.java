import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        crearArchivo();
    }

    //funcion para cargar objetos empleados por el usuario y retorna una lista de objetos empleados
    public static List<Empleado> cargarEmpleado(){

        int nroLegajo = 1, seguir;
        Scanner scan = new Scanner(System.in);
        List<Empleado> listEmpl = new ArrayList<>();

        do {

            System.out.println("    <--BIENVENIDOS-->");
            System.out.println("App para cargar Empleados");
            System.out.println("**************************");
            System.out.println("Legajo de empleado nro: " + nroLegajo);
            System.out.println("ingrese el nombre:");
            String nombre = scan.nextLine();
            System.out.println("ingrese el apellido:");
            String apellido = scan.nextLine();
            System.out.println("ingrese el dni:");
            Integer dni = Integer.valueOf(scan.nextLine());
            System.out.println("ingrese la fecha de nacimiento  ejemplo de formato(01/10/2019)");
            String fechaNac = scan.nextLine();
            listEmpl.add(new Empleado(nombre,apellido,dni,fechaNac));

            System.out.println("Desea agregar otro empleado?");
            System.out.println("1- si desea continuar\n"+
                                "2- si desea salir... ");
            seguir = Integer.valueOf(scan.nextLine());
            //print para borrar consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            nroLegajo++;

        } while (seguir == 1);

        scan.close();

        return listEmpl;
    }

    //Procedimiento para crear un archivo txt
    public static void crearArchivo(){

        try {

            List<Empleado> listaEmpleados =  cargarEmpleado();
            String ubicacion = "D:\\empleado.txt";

            File txt = new File(ubicacion);

            if(!txt.exists()) txt.createNewFile();

            FileWriter fW = new FileWriter(txt);
            BufferedWriter bW = new BufferedWriter(fW);

            //recorre la lista empleado y escribe en el archivo
            for (Empleado empleado : listaEmpleados) {
                bW.append(empleado.toString() + "\n");
            }
            bW.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
