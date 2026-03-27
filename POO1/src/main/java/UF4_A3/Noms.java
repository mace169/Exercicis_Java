package UF4_A3;

public class Noms {

    //Atributs de la classe
    private int capacitatMaxLlista;
    private int quantitatElementsLlista = 0;
    private String[] llista;

    //Constructor
    public Noms(int capacitatMaxLlista) {
        this.capacitatMaxLlista = capacitatMaxLlista;
        this.llista = new String[getCapacitatMaxLlista()];
    }

    //Getters i setters
    public int getCapacitatMaxLlista() {
        return capacitatMaxLlista;
    }

    public void setCapacitatMaxLlista(int capacitatMaxLlista) {
        this.capacitatMaxLlista = capacitatMaxLlista;
    }

    public int getQuantitatElementsLlista() {
        return quantitatElementsLlista;
    }

    public void setQuantitatElementsLlista(int quantitatElementsLlista) {
        this.quantitatElementsLlista = quantitatElementsLlista;
    }

    //Metode per afegir noms a la llista
    public int afegirNom(String nom) {

        //Si la llista esta plena retornem -1
        if (llistaPlena() == true) {
            return -1;
        }

        //Revisem que el nom no estigui repetit
        for (int i = 0; i < this.quantitatElementsLlista; i++) {

            if (nom.equalsIgnoreCase(this.llista[i])) {
                return 1;
            }
        }
        //Si el nom no estava repetit l'introduim a la primera posició disponible
        this.llista[quantitatElementsLlista] = nom;
        quantitatElementsLlista++;
        return 0;
    }

    //Metode per eliminar noms de la llista
    public boolean eliminarNom(String nom) {

        //Bucle per eliminar el nom si està dins la llista
        for (int i = 0; i < this.quantitatElementsLlista; i++) {

            if (nom.equalsIgnoreCase(this.llista[i])) {
                for (int j = i; j < quantitatElementsLlista - 1; j++) {
                    this.llista[j] = this.llista[j + 1];
                }
                llista[quantitatElementsLlista - 1] = null;
                quantitatElementsLlista--;
                return true;
            }
        }

        //Si el nom no hi és retornem false
        return false;
    }

    //Metode per buidar la llista
    public void buidarLlista() {

        for (int i = 0; i < this.quantitatElementsLlista; i++) {
            this.llista[i] = null;
        }
        quantitatElementsLlista = 0;
    }

    //Metode per mostrar un nom partint de la seva posicio
    public String mostrarNom(int posicio) {

        //Si la posició esta plena retornem el nom
        if (posicio >= 0 && posicio < quantitatElementsLlista) {
            return llista[posicio];
        }

        //Si no està plena retornem null
        return null;
    }

    //Metode que avisa si la llista esta plena
    public boolean llistaPlena() {

        //Si la llista esta plena retornem true
        if (quantitatElementsLlista == capacitatMaxLlista) {
            return true;
        }

        //Si no esta plena retornem false
        return false;
    }

    //Metode que retorna el contingut de la llista
    @Override //Per evitar aplicar el metode toString de la classe "Object" de Java
    public String toString() {

        //Si la llista esta buida...
        if (quantitatElementsLlista == 0) {
            return "La llista esta buida!";
        }

        //Si la llista conte noms...
        String llista = "";
        for (int i = 0; i < quantitatElementsLlista; i++) {
            llista += i + " - " + this.llista[i] + "\n";
        }
        return llista;
    }
}
