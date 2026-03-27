package UF4_A7;

public class Empleat {

    //Atributs
    final String nif;
    private String nom;
    private String telefon;

    //Constructor sense telefon
    public Empleat(String nif, String nom) {
        this.nif = nif.toUpperCase();
        this.nom = nom;
        this.telefon = "Telefon no facilitat";
    }

    //Constructor amb telefon
    public Empleat(String nif, String nom, String telefon) {
        this.nif = nif.toUpperCase();
        this.nom = nom;
        this.telefon = telefon;
    }

    //Getters i setters
    public String getNif() {
        return nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    //Metode equals
    @Override
    public boolean equals(Object obj) {
        
        //Mateix objecte en memòria?
        if (this == obj){
            return true;
        }
        
        //Es null o d'una classe diferent?
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        
        //Cast per accedir als atributs de l'altre Empleat
        Empleat empleat2 = (Empleat) obj;
        
        //Comparem els atributs nif dels 2 empleats
        return this.nif.equals(empleat2.nif);
    }
    
    //Metode toString per imprimir les dades
    @Override
    public String toString() {

        return "\nNIF: " + this.nif
                + "\nNom: " + this.nom
                + "\nTelefon: " + this.telefon;
    }
}
