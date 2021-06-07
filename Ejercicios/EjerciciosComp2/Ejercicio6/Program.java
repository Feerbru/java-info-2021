import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/*Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.
*/

public class Program {
    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer,String> listaSueldo = new HashMap<>();

        empleados.addAll(cargarEmpleados());
        listaSueldo = calcularSueldo(empleados);
        imprimirMap(listaSueldo);

    }
    public static Set<Empleado> cargarEmpleados(){

        Set<Empleado> empleado = new HashSet<>();
        Empleado vector[] = crearEmpleados();

        for (int i = 0; i < vector.length; i++) {
            empleado.add(vector[i]);
        }
        return empleado;
    }

    private static Empleado[] crearEmpleados(){

        Scanner scan = new Scanner(System.in);
        String nomb, apell, Dni;
        int cantEmpleados, horasTrab, valorPHora;

        System.out.println("Ingrese la cantidad de empleados que desea cargar:");
        cantEmpleados = scan.nextInt();

        Empleado vector[] = new Empleado[cantEmpleados];

        for (int i = 0; i < vector.length; i++) {

            System.out.print("Ingrese el nombre:\n");
            nomb = scan.nextLine();
            System.out.println("Ingrese el apellido:");
            apell = scan.nextLine();
            System.out.println("ingrese el dni:");
            Dni = scan.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            horasTrab = scan.nextInt();
            System.out.println("Ingrese el valor por horas trabajadas: ");
            valorPHora = scan.nextInt();

            vector[i] = new Empleado(nomb,apell,Dni,horasTrab,valorPHora);
        }

        scan.close();
        return vector;
    }

    public static Map<Integer, String> calcularSueldo(Set<Empleado> listaEmpleados){

        Map<Integer, String> totalSueld = new HashMap<>();

        for (Empleado empleado : listaEmpleados) {
            String total = "$" +  empleado.getHorasTrabajadas() * empleado.getValorPorHoras();
            totalSueld.put(Integer.parseInt(empleado.getDNI()), total);
        }

        return totalSueld;
    }

    public static void imprimirMap(Map<Integer, String> listaEmple){
        Iterator<Integer> ite = listaEmple.keySet().iterator();

        while (ite.hasNext()) {
            Integer key = ite.next();
            System.out.println("Dni:" + key + ", Sueldo:" + listaEmple.get(key));
        }
    }
}
