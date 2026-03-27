package Agenda;

public class Contacte {

    private String nom;
    private String cognom;
    private int telefon;

    public Contacte(String nom, String cognom, int telefon) {
        this.nom = nom;
        this.cognom = cognom;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {

        return "\nNom: " + this.nom
                + "\nCognom: " + this.cognom
                + "\nTelefon: " + this.telefon;
    }
}
