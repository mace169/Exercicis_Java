package UF4_A7;

public class Programador extends Empleat {

    //Atributs
    private String[] llenguatges;
    private int numLlenguatges;

    //Constructor
    public Programador(String nif, String nom, String telefon, String[] llenguatges) {
        super(nif, nom, telefon);
        this.llenguatges = llenguatges;
    }
    
    //Constructor sense telefon
    public Programador(String nif, String nom, String[] llenguatges) {
        super(nif, nom);
        this.llenguatges = llenguatges;
    }

    //Getters i setters
    public String[] getLlenguatges() {
        return llenguatges;
    }

    public void setLlenguatges(String[] llenguatges) {
        this.llenguatges = llenguatges;
    }

    public int getLlenguatgesConeguts() {
        return numLlenguatges;
    }

    public void setLlenguatgesConeguts(int llenguatgesConeguts) {
        this.numLlenguatges = llenguatgesConeguts;
    }

    //Metode toString per imprimir
    @Override
    public String toString() {

        String textLlenguatges = "";

        for (int i = 0; i < this.llenguatges.length; i++) {
            textLlenguatges += this.llenguatges[i];
            if (i < this.llenguatges.length - 1) {
                textLlenguatges += ", ";
            }
        }

        return super.toString()
                + "\nLlenguatges: " + textLlenguatges;
    }
}
