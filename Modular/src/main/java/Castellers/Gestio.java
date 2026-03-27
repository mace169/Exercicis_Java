package Castellers;

import java.util.Scanner;

public class Gestio {
    
    // Arrays de dades
    static Castell[] arrayCastell = {
        new Castell(1, "Quatre de set", 800, 980),
        new Castell(27, "Tres de deu amb folre i manilles", 12500, 13200),
        new Castell(3, "Quatre de set amb l'agulla", 1220, 1440),
        new Castell(22, "Quatre de nou amb folre i l'agulla", 9200, 9800),
        new Castell(2, "Tres de set", 1000, 1200),
        new Castell(21, "Cinc de nou amb folre", 8600, 9180),
        new Castell(20, "Pilar de vuit amb folre i manilles", 8020, 8580)
    };

    static int[] codis = {2, 1, 3};
    static int[] codis2 = {2, 1, 3};
    static int[] codis3 = {22, 20, 21};
    static int[] codis4 = {27, 22, 20};

    static Colla[] arrayColla = {
        new Colla("Colla Vella dels Xiquets de Valls", "Valls", codis),
        new Colla("Xiquets del Serrallo", "Tarragona", codis2),
        new Colla("Minyons de Terrassa", "Terrassa", codis3),
        new Colla("Xiquets de Vilafranca", "Vilafranca", codis4)
    };

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("--- CONSULTA COLLA ---");
        System.out.print("Introdueix el nom de la colla: ");
        String nomC = lector.nextLine();
        dadesColla(nomC);

        System.out.println("\n--- CONSULTA CASTELL ---");
        System.out.print("Introdueix el nom del castell: ");
        String nomCast = lector.nextLine();
        collesCastell(nomCast);
    }

    // Mostra els castells d'una colla
    public static void dadesColla(String nomColla) {
        boolean trobada = false;
        for (Colla colla : arrayColla) {
            if (colla.getNom().equalsIgnoreCase(nomColla)) {
                trobada = true;
                System.out.println("Colla: " + colla.getNom());
                
                // Recorrem els codis que té la colla
                for (int codiCercat : colla.getCodisCastellsPrincipals()) {
                    // Busquem el nom d'aquest codi a l'array de Castells
                    for (Castell castell : arrayCastell) {
                        if (castell.getCodi() == codiCercat) {
                            System.out.println("Castell: " + castell.getDescripcio());
                        }
                    }
                }
            }
        }
        if (!trobada) System.out.println("No s'ha trobat la colla: " + nomColla);
    }

    // Mostra les colles que han fet un castell especific
    public static void collesCastell(String nomCastell) {
        int codiCastellTrobat = -1;
        
        // Busquem primer quin codi té el nom del castell donat
        for (Castell c : arrayCastell) {
            if (c.getDescripcio().equalsIgnoreCase(nomCastell)) {
                codiCastellTrobat = c.getCodi();
                System.out.println("Castell: " + c.getDescripcio());
                break;
            }
        }

        if (codiCastellTrobat == -1) {
            System.out.println("No s'ha trobat cap castell amb el nom: " + nomCastell);
            return;
        }

        // Busquem quines colles tenen aquest codi en el seu array
        for (Colla colla : arrayColla) {
            for (int codi : colla.getCodisCastellsPrincipals()) {
                if (codi == codiCastellTrobat) {
                    System.out.println("Colla: " + colla.getNom());
                }
            }
        }
    }
}
