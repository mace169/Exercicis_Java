package _8_Exemple;

public class Programa {
    
    public static void main(String[] args) {
        
        Compte compte_1 = new Compte("Josep");
        Compte compte_2 = new Compte("Fernando", 300);
    
    //Ingressa diners
    compte_1.ingressar(300);
    compte_2.ingressar(400);
    
    //Retira diners
    compte_1.retirar(500);
    compte_2.retirar(100);
    
    //Mostrar informació dels comptes
    System.out.println(compte_1.toString());
    System.out.println(compte_2.toString());
    System.out.println(compte_1);
    System.out.println(compte_2);
    }    
}
