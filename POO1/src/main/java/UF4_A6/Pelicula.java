package UF4_A6;

public class Pelicula extends Multimedia {

    // Atributs
    private String actor;
    private String actriu;

    // Constructor
    public Pelicula(String titol, String autor, String format, int durada, String actor, String actriu) {
        super(titol, autor, format, durada);
        this.actor = actor;
        this.actriu = actriu;
    }

    // Getters i setters
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriu() {
        return actriu;
    }

    public void setActriu(String actriu) {
        this.actriu = actriu;
    }

    // Mètode toString per imprimir
    @Override
    public String toString() {
        return super.toString()
                + "\nActor: " + this.actor
                + "\nActriu: " + this.actriu + "\n";

        //ALTERNATIVA
        //return "Titol: " + super.getTitol()
        //+ "\nAutor: " + super.getAutor()
        //+ "\nFormat: " + super.getFormat()
        //+ "\nDurada: " + super.getDurada()
        //+ "\nActor: " + this.actor
        //+ "\nActriu: " + this.actriu;
    }
}
