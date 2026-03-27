package UF11_UML;

public class Pelicula extends Multimedia {

    //Atributs
    private String actor;
    private String actriu;

    //Constructor
    public Pelicula(String titol, String autor, String format, int durada, String actor, String actriu) {

        super(titol, autor, format, durada);
        this.actor = actor;
        this.actriu = actriu;
    }
    
    //Setters i getters
    public String getActor(){
        return this.actor;
    }
    
    public void setActor(String actor){
        this.actor = actor;
    }
    
    public String getActriu(){
        return this.actriu;
    }
    
    public void setActriu(String actriu){
        this.actriu = actriu;
    }
    
    //Metode toString per imprimir una pelicula
    @Override
    public String toString(){
        
        return super.toString()
                + "\nActor: " +this.actor
                + "\nActriu: " +this.actriu;
    }
}
