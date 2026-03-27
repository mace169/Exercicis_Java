package Agenda;

import java.util.Scanner;

public class GestioAgenda {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Agenda agenda = new Agenda(10);
        String opcio = "";

        while (!opcio.equals("FI")) {

            System.out.println("\nAgenda");
            System.out.println("----------------------------");
            System.out.println("[IC] Introduir contacte.");
            System.out.println("[BC] Buscar contacte per cognom.");
            System.out.println("[EC] Esborrar contacte per posicio.");
            System.out.println("[LA] Llistar agenda.");
            System.out.println("[FI] Sortir.\n");

            System.out.print("Opcio: ");
            opcio = lector.nextLine().toUpperCase();

            switch (opcio) {

                //Introduir contacte
                case "IC":
                    System.out.print("\nNom: ");
                    String nom = lector.nextLine().toUpperCase();
                    System.out.print("\nCognom: ");
                    String cognom = lector.nextLine().toUpperCase();
                    System.out.print("\nTelefon: ");
                    int telefon = lector.nextInt();
                    lector.nextLine();

                    Contacte nou = new Contacte(nom, cognom, telefon);
                    agenda.introduirContacte(nou);
                    break;

                //Buscar contacte per cognom
                case "BC":
                    System.out.print("\nCognom: ");
                    cognom = lector.nextLine().toUpperCase();
                    agenda.buscarCognom(cognom);
                    break;

                //Esborrar contacte per posicio
                case "EC":
                    System.out.print("Posicio: ");
                    int posicio = lector.nextInt();
                    lector.nextLine();
                    agenda.esborrarContacte(posicio);
                    break;

                //Llistar agenda
                case "LA":
                    System.out.println(agenda);
                    break;

                //Sortir
                case "FI":

                    System.out.println("\nSortint.");
                    break;

                default:
                    System.out.println("\nOpcio no valida.");
            }
        }
    }
}
