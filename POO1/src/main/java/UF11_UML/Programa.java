package UF11_UML;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Programa programa = new Programa();

        //Mida de l'array llista de coleccio
        Coleccio coleccio = new Coleccio(5);

        //menu
        int opcio = -1;
        do {

            try {
                programa.imprimirMenu();
                System.out.print("Opcio: ");
                opcio = lector.nextInt();
                lector.nextLine();

                switch (opcio) {
                    //Afegir pelicula
                    case 1:
                        System.out.print("\nTitol: ");
                        String titol = lector.nextLine();
                        System.out.print("Autor: ");
                        String autor = lector.nextLine();
                        System.out.print("Format: ");
                        String format = lector.nextLine();
                        System.out.print("Durada(minuts): ");
                        int durada = lector.nextInt();
                        lector.nextLine();
                        System.out.print("Actor: ");
                        String actor = lector.nextLine();
                        System.out.print("Actriu: ");
                        String actriu = lector.nextLine();

                        Pelicula pelicula = new Pelicula(titol, autor, format, durada, actor, actriu);
                        boolean afegirOk = coleccio.afegirMulti(pelicula);
                        if (afegirOk) {
                            System.out.println("Pelicula afegida correctament.");
                        } else {
                            System.out.println("Llista plena.");
                        }
                        break;

                    //Llistar coleccio
                    case 2:
                        coleccio.llistarMulti();
                        break;

                    //Sortir
                    case 3:
                        System.out.println("Sortint..");
                        break;

                    default:
                        System.out.println("Valor massa gran o petit.");
                }

            } catch (Exception e) {
                System.out.println("Valor no valid.");
                lector.nextLine();
            }
        } while (opcio != 3);
    }

    public void imprimirMenu() {

        System.out.println("\n-------- MENU --------");
        System.out.println("----------------------");
        System.out.println("1. Afegir pel.licula");
        System.out.println("2. Llistar col.leccio");
        System.out.println("3. Sortir");
        System.out.println("----------------------");

    }

}
