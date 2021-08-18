import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Empleado {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private LocalDate fechaNac;

    public Empleado(String nombre, String apellido, Integer dni, String fechaN){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = LocalDate.parse(fechaN, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public Integer getDni(){
        return this.dni;
    }
    public LocalDate getFechaNac(){
        return this.fechaNac;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.apellido + ", " + this.dni + ", " + formatearFecha();
    }

    //funcion para formatear la fecha
    public String formatearFecha(){
        DateTimeFormatter dF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fechaNac.format(dF);
    }
}
