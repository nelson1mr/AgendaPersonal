import java.time.LocalTime;
import java.util.ArrayList;

public class Nota
{
    private int id;
    private LocalTime hora = LocalTime.now(); //creamos por defecto con la hora del sistema
    private String descripcion;
    
    public Nota(int id, /*LocalTime hora,*/ String descripcion)
    {
        this.id = id;
        //this.hora = hora;
        this.descripcion = descripcion;
    }
    
    //getters
    public int getId(){
        return this.id;
    }
    public LocalTime getHora(){
        return this.hora;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    
    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setHora(int hora, int minuto, int segundo){
        this.hora = LocalTime.of(hora, minuto, segundo);
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    //metodos
    public void mostrar(){
        System.out.println("Id: " + getId());
        System.out.println("Hora: " + getHora());
        System.out.println("Descripción: " + getDescripcion());
    }
}
