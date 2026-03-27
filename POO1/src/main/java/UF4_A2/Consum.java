package UF4_A2;

public class Consum {
    public static void main(String[] args) {
        
        //Creem els 3 aparells
        Aparell bombeta = new Aparell(100);
        Aparell radiador = new Aparell(2000);
        Aparell planxa = new Aparell(1200);
        
        //Consum total de tots els aparells apagats
        System.out.println("Consum total: " +Aparell.getConsumTotal() + " wats.");
        
        //Consum de bombeta i planxa
        bombeta.encendre();
        planxa.encendre();
        System.out.println("Consum total: " +Aparell.getConsumTotal() + " wats.");
        
        //Apaguem planxa i encenem radiador
        planxa.apagar();
        radiador.encendre();
        System.out.println("Consum total: " +Aparell.getConsumTotal() + " wats.");
        
    }
}
