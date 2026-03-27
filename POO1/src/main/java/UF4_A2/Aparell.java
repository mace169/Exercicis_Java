package UF4_A2;

public class Aparell {
    private int consum;
    private boolean ences = false;
    private static int consumTotal = 0;
    
    //Constructor (aparells apagats inicialment)
    public Aparell(int consum){
        this.consum = consum;
    }

    //Getters i setters
    public int getConsum() {
        return consum;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }

    public boolean isEnces() {
        return ences;
    }

    public void setEnces(boolean ences) {
        this.ences = ences;
    }
    
    //Metode per encendre els aparells
    public void encendre(){
        if (!this.ences){
            this.ences = true;
            consumTotal += this.consum;
        }
    }
    
    //Metode per apagar els aparells
    public void apagar(){
        if (this.ences){
            this.ences = false;
            consumTotal -= this.consum;
        }
    }

    //Getter de consum total
    public static int getConsumTotal() {
        return consumTotal;
    }
    
    
}
