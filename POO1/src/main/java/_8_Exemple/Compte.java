package _8_Exemple;

public class Compte {

    //Atributs
    private String titular;
    private double quantitat;
    
    //Constructors
    public Compte (String titular, double quantitat) {
        this.titular = titular;
        this.quantitat = quantitat;
    }
    
    public Compte (String titular) {
        this(titular, 0); //Sobrecarrega
    }
    
    //Metodes
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getQuantitat() {
        return quantitat;
    }
    
    public void setQuantitat(double quantitat) {
        this.quantitat = quantitat;
    }
    
    //Ingressa diners en el compte
    public void ingressar (double quantitat) {
        this.quantitat += quantitat;
    }
    
    //Retira diners
    public void retirar (double quantitat) {
        if(this.quantitat >= quantitat){
            this.quantitat = this.quantitat - quantitat;
        }
        else{
            this.quantitat=0;
        }
    }
    
    //Retorna l'estat de l'objecte
    @Override
    public String toString() {
        
        return "El titular " +titular+ " te " +quantitat+ "€.";
    }
}
