import java.util.ArrayList;

public class Agenda
{
    private ArrayList<Nota> notas;
    
    //constructor
    public Agenda(){
        notas = new ArrayList<Nota>();
    }
    
    //getter y setter
    public ArrayList<Nota> getNotas()
    {
        return notas;
    }
    
    public void setNotas(ArrayList<Nota> notas)
    {
        this.notas = notas;
    }
    
    //metodos
    public void addNota(int id, String descripcion){
        Nota nota = new Nota(id, descripcion);
        notas.add(nota);
    }
    
    public void borrarNota(int id){
        int indice = 0;
        for(Nota nota : notas){
            if(nota.getId() == id){
                notas.remove(indice);
                break;
            }
            indice ++;
        }
    }
    
    public void listarNotas(){
        for(Nota nota : this.notas){
            nota.mostrar();
            System.out.println();
        }
    }
    
    public int contarNotas(){
        return notas.size();
    }
}
