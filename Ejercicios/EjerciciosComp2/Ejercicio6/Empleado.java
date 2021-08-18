
public class Empleado {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private int horasTrabajadas;
    private int valorPorHoras;

    public Empleado(String nombre, String apellido, String dni, int horasTrab, int valorPorHoras){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = dni;
        this.horasTrabajadas = horasTrab;
        this.valorPorHoras = valorPorHoras;
    }

    public Empleado(){};

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
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public String getDNI(){
        return this.DNI;
    }
    public void setHorasTrabajadas(int horasTrab){
        this.horasTrabajadas = horasTrab;
    }
    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void setValorPorhoras(int valor){
        this.valorPorHoras = valor;
    }
    public int getValorPorHoras(){
        return this.valorPorHoras;
    }



}
