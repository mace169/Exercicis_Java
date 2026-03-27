package UF4_A7;

public class TestEmpleats {

    public static void main(String[] args) {

        Empleat[] llista = new Empleat[3];

        //Empleat sense especialització
        llista[0] = new Empleat("39222179X", "Pepe Tapies", "659333123");

        //Empleat programador sense telefon
        String[] llenguatges = {"C", "Modula", "Java", "Ada"};
        llista[1] = new Programador("39317246A", "Nuria Verdu", llenguatges);

        //Empleat comercial
        Comercial c1 = new Comercial("45222164V", "Juan Garcia", "659212716", "Tarragona");
        c1.vendaProducte("Rentadora", 300);
        c1.vendaProducte("Microones", 115);
        llista[2] = c1;
        
        //Impresió utilitzant toString
        System.out.println("Metode toString");
        System.out.println("-----------------------------------");
        for (int i = 0; i < llista.length; i++) {
            System.out.println(llista[i]);
        }
    }
}
