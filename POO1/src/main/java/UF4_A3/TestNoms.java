package UF4_A3;

import java.util.Scanner;

public class TestNoms {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Assignació mida llista i creacio d'objecte
        int mida = 0;
        boolean valorOK = false;
        do {
            try {
                System.out.print("Introdueix el valor de la capacitat maxima de la llista: ");
                mida = lector.nextInt();
                lector.nextLine();
                valorOK = true;
            } catch (Exception e) {
                System.out.println("Error. Valor no valid.");
                lector.nextLine();
            }
        } while (!valorOK || mida <= 0);

        // Creacio de l'objecte
        Noms llistaNoms = new Noms(mida);
        System.out.println("La llista te una capacitat maxima de " + mida + " noms.\n");

        //Menú
        menu(lector, llistaNoms);

    }

    //Menu
    public static void menu(Scanner lector, Noms llistaNoms) {

        //Triar opció del menú
        int opcio = -1;

        do {

            //Menú
            System.out.println("----------------------------");
            System.out.println("----------- MENU -----------");
            System.out.println("----------------------------");
            System.out.println("1) Afegir Nom");
            System.out.println("2) Eliminar Nom");
            System.out.println("3) Buidar Llista");
            System.out.println("4) Mostrar Nom");
            System.out.println("5) Llista Plena?");
            System.out.println("6) Mostrar tota la llista");
            System.out.println("7) Sortir");
            System.out.println("----------------------------\n");

            //Triar opció del menú
            try {

                System.out.print("Opcio: ");
                opcio = lector.nextInt();
                lector.nextLine();
                switch (opcio) {

                    case 1: //Afegir nom
                        System.out.print("Nom a afegir: ");
                        String nomAfegir = lector.nextLine();
                        int resultatAfegir = llistaNoms.afegirNom(nomAfegir);
                        if (resultatAfegir == -1) {
                            System.out.println("Llista plena!\n");
                        } else if (resultatAfegir == 1) {
                            System.out.println("Nom ja a la llista!\n");
                        } else if (resultatAfegir == 0) {
                            System.out.println("Nom afegit correctament!\n");
                        }
                        break;

                    case 2: //Eliminar nom
                        System.out.print("Nom a eliminar: ");
                        String nomEliminar = lector.nextLine();
                        boolean resultatEliminar = llistaNoms.eliminarNom(nomEliminar);
                        if (resultatEliminar) {
                            System.out.println("Nom eliminat correctament!\n");
                        } else {
                            System.out.println("Aquest nom no es a la llista.\n");
                        }
                        break;

                    case 3: //Buidar llista
                        llistaNoms.buidarLlista();
                        System.out.println("Llista buida!\n");
                        break;

                    case 4: //Mostrar nom
                        System.out.print("Posicio de la llista: ");
                        try {
                            int posicio = lector.nextInt();
                            lector.nextLine();
                            String resultatMostrarNom = llistaNoms.mostrarNom(posicio);
                            if (posicio < 0 || posicio >= llistaNoms.getCapacitatMaxLlista()) {
                                System.out.println("Posicio fora de rang.\n");
                            } else if (resultatMostrarNom == null) {
                                System.out.println("Posicio de la llista buida.\n");
                            } else {
                                System.out.println(resultatMostrarNom);
                            }
                        } catch (Exception e) {
                            System.out.println("Valor no valid.\n");
                            lector.nextLine();
                        }
                        break;

                    case 5: //Llista plena?
                        boolean llistaPlena = llistaNoms.llistaPlena();
                        if (!llistaPlena) {
                            System.out.println("La llista encara no esta plena.\n");
                        } else {
                            System.out.println("La llista esta plena.\n");
                        }
                        break;

                    case 6: //Mostrar tota la llista
                        String llista = llistaNoms.toString();
                        System.out.println(llista);
                        break;

                    case 7: //Sortir
                        System.out.println("Sortint...");
                        break;
                    default:
                        System.out.println("El valor ha de ser entre 1 i 7.\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error. Valor no valid.\n");
                lector.nextLine();
            }
        } while (opcio != 7);
    }
}
