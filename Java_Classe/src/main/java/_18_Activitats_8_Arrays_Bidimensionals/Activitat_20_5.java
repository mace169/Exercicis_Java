package _18_Activitats_8_Arrays_Bidimensionals;

import java.util.Random;
import java.util.Scanner;

public class Activitat_20_5 {

    //Atributs de la classe
    double[][] grups = new double[3][15];
    int grup;
    Scanner lector = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {

        Activitat_20_5 programa = new Activitat_20_5();
        programa.menu();
    }
    
    //Menú per seleccionar opcions
    public void menu() {
        int opcio = 0;
        do {
            System.out.println("\n------------------- MENU -------------------");
            System.out.println("1. Assignar notes aleatories a un grup.");
            System.out.println("2. Modificar nota d'un alumne.");
            System.out.println("3. Calcular nota mitjana d'un grup.");
            System.out.println("4. Llistar notes de tots els grups.");
            System.out.println("5. Sortir");
            System.out.println("--------------------------------------------");

            //Validació de que s'introdueix un número vàlid
            try {
                System.out.print("Opcio: ");
                opcio = lector.nextInt();
                lector.nextLine();

                //Validació de que el numero estigui entre 1 i 4
                if (opcio < 1 || opcio > 5) {
                    System.out.println("\nError. Valor mes petit de 1 o mes gran de 5.");
                    System.out.println("--------------------------------------------");
                }
            } catch (Exception e) {
                System.out.println("\nError. Valor no valid.");
                System.out.println("--------------------------------------------");
                lector.nextLine();
            }
            System.out.println();
            switch (opcio) {
                case 1 ->
                    this.assignarNotes();
                case 2 ->
                    this.modificarNota();
                case 3 ->
                    this.calcularMitjana();
                case 4 ->
                    this.llistarNotes();
            }
        } while (opcio != 5);
    }
    
    //Metode per assignar notes
    public void assignarNotes() {
        do {
            System.out.print("Introdueix el grup (1-3): ");
            grup = lector.nextInt();
        } while (grup < 1 || grup > 3);
        
        for (int i = 0; i < grups[grup - 1].length; i++){
            grups[grup - 1][i] = random.nextInt(101) / 10.0;
        }
        System.out.println("Notes assignades.");
    }
    
    //Metode per modificar la nota
    public void modificarNota() {
        int alumne;
        double novaNota;
        
        //Introduim el grup
        do {
            System.out.print("Introdueix el grup (1-3): ");
            grup = lector.nextInt();
        } while (grup < 1 || grup > 3);
        
        //Introduim l'alumne
        do {
            System.out.print("Introdueix l'alumne (1-15): ");
            alumne = lector.nextInt();
        } while (alumne < 1 || alumne > 15);
        
        //Introduim la nova nota
        do {
            System.out.print("Introdueix la nota (0-10): ");
            novaNota = lector.nextDouble();
        } while (novaNota < 0 || novaNota > 10);
        
        grups[grup - 1][alumne - 1] = novaNota;
        System.out.println("Nota modificada.");
    }
    
    //Metdode per calcular la mitjana
    public void calcularMitjana() {
        do {
            System.out.print("Introdueix el grup (1-3): ");
            grup = lector.nextInt();
        } while (grup < 1 || grup > 3);
        
        double suma = 0;
        for (int i = 0; i < grups[grup - 1].length; i++) {
            suma += (grups[grup - 1][i]);
        }
        System.out.println("La mitjana del grup " +grup+ " es " +suma/15.0+ ".");
    }
    
    //Metode per llistar les notes
    public void llistarNotes() {
        for (int i = 0; i < grups.length; i++) {
            System.out.print("Grup " + (i + 1) + ": ");
            for (int j = 0; j < grups[i].length; j++) {
                System.out.print(grups[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    
    
}
