package Agenda;

public class Agenda {

    private Contacte[] llista;
    private int total = 0;

    public Agenda(int capacitat) {
        this.llista = new Contacte[capacitat];
    }

    public Contacte[] getLlista() {
        return llista;
    }

    public void setLlista(Contacte[] llista) {
        this.llista = llista;
    }

    public void introduirContacte(Contacte nouContacte) {

        if (this.total < this.llista.length) {

            this.llista[this.total] = nouContacte;
            this.total++;
        } else {
            System.out.println("Agenda plena");
        }
    }

    public void buscarCognom(String cognom) {

        boolean trobat = false;
        if (this.total > 0) {
            for (int i = 0; i < this.total; i++) {
                if (this.llista[i].getCognom().equals(cognom)) {
                    System.out.println("\nNom: " + this.llista[i].getNom()
                            + "\nTelefon: " + this.llista[i].getTelefon());
                    trobat = true;
                }
            }
            if (!trobat) {
                System.out.println("Cognom no es a la llista");
            }

        } else {
            System.out.println("Llista buida");
        }
    }
    
    public void esborrarContacte(int num){
        
        if (num >= 0 && num < this.total){
            
                for(int i = num; i < this.total -1; i++){
                    this.llista[i] = this.llista[i+1];
                }
                this.llista[this.total -1] = null;
                
                this.total--;
                System.out.println("Contacte esborrat");
                
        }else{
            System.out.println("Valor no valid");
        }
    }
    
    @Override
    public String toString(){
        
        
        if ( this.total == 0){
            return "\nAgenda buida";
        }
        
        String resultat = "\nAgenda\n";
        
        for (int i = 0; i < this.total; i++){
            resultat += "\nContacte " +i
                    + this.llista[i].toString()
                    +"\n----------------------";
        }
        return resultat;
    }
}
