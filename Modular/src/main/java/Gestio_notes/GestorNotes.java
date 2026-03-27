package Gestio_notes;

import java.util.Scanner;

public class GestorNotes {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Aula aula = new Aula(40);
        String opcio = "";

        while (!opcio.equals("FI")) {

            System.out.println("\nBenvingut al gestor de notes");
            System.out.println("----------------------------");
            System.out.println("[RT] Registrar notes.");
            System.out.println("[MJ] Consultar nota mitjana.");
            System.out.println("[HT] Histograma de notes.");
            System.out.println("[FI] Sortir.\n");

            System.out.print("Opcio: ");
            opcio = lector.nextLine().toUpperCase();

            switch (opcio) {
                case "RT":
                    System.out.println("\nEscriu les notes, posa -1 per acabar:");

                    double nota = lector.nextDouble();
                    while (nota != -1) {
                        aula.afegirNota(nota);
                        nota = lector.nextDouble();
                    }
                    lector.nextLine();
                    break;

                case "MJ":

                    aula.notaMitjana();
                    break;

                case "HT":

                    aula.histograma();
                    break;

                case "FI":

                    System.out.println("\nSortint.");
                    break;

                default:
                    System.out.println("\nOpcio no valida.");
            }
        }
    }
}
