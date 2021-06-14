
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Persona {
    
    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private BigDecimal Sueldo;

    public Persona(String nomb, String apell, String fecha, String sueldo){
        this.nombre = nomb;
        this.apellido = apell;
        this.fecha = LocalDate.parse(fecha , DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.Sueldo = new BigDecimal(sueldo);
    }
    public Persona(){};

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setFecha(String fecha){
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public LocalDate getFecha(){
        return  this.fecha;
    }
    public void setSueldo(String sueldo){
        this.Sueldo = new BigDecimal(sueldo);
    }
    public BigDecimal getSueldo(){
        return this.Sueldo;
    }
    @Override
    public String toString() {
        return "Nombre y Apellido: " + this.nombre + "," + this.apellido + " - Fecha de Nacimiento: " + formatearFecha() + " - Sueldo: $" + this.Sueldo;
    }

    public String formatearFecha(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fecha.format(df);
    }
}
