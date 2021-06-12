import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    
    private String nombre;
    private String apellido;
    private Date fecha;
    private BigDecimal Sueldo;

    public Persona(String nomb, String apell, String fecha, String sueldo) throws ParseException{
        this.nombre = nomb;
        this.apellido = apell;
        this.fecha = FormatearFecha(fecha);
        this.Sueldo = new BigDecimal(sueldo);
    }
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
    
    





    private Date FormatearFecha(String fechas) throws ParseException{

        DateFormat darFormato = new SimpleDateFormat("DD/MM/YYYY");
        return darFormato.parse(fechas);
    }

}
