package Biblioteca;

import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
    
        Scanner lector = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(10);
        
        //Dades inicials
        biblioteca.afegirLlibre(new Llibre("978-84-376-1067-8", "Cien anos de soledad", "Gabriel Garcia Marquez", "Editorial Sudamericana"));
        biblioteca.afegirLlibre(new Llibre("978-84-376-0167-2", "Don Quijote de la Mancha", "Miguel de Cervantes", "Editorial Planeta"));
        biblioteca.afegirLlibre(new Llibre("978-0-06-112241-5", "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co."));
        biblioteca.afegirLlibre(new Llibre("978-84-92627-19-9", "La sombra del viento", "Carlos Ruiz Zafon", "Editorial Planeta"));
        biblioteca.afegirLlibre(new Llibre("978-0-452-28423-4", "1984", "George Orwell", "Secker & Warburg"));
        biblioteca.afegirLlibre(new Llibre("978-84-462-4236-2", "La catedral del mar", "Ildefonso Falcones", "Editorial Grijalbo"));
        biblioteca.afegirLlibre(new Llibre("978-84-9027-791-2", "Harry Potter y la piedra filosofal", "J.K. Rowling", "Editorial Salamandra"));
        biblioteca.afegirLlibre(new Llibre("978-84-322-1099-4", "El principito", "Antoine de Saint-Exupery", "Editorial Herder"));
        biblioteca.afegirLlibre(new Llibre("978-84-350-1482-7", "El alquimista", "Paulo Coelho", "Editorial Planeta"));
        biblioteca.afegirLlibre(new Llibre("978-0-14-143960-0", "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall"));
        
        int opcio;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Llistar llibres");
            System.out.println("2. Ordenar per ISBN");
            System.out.println("3. Buscar per autor");
            System.out.println("4. Buscar per ISBN");
            System.out.println("0. Sortir");
            System.out.println("Opcio: ");
            
            opcio = lector.nextInt();
            lector.nextLine();
            
            switch (opcio) {
                case 1 -> biblioteca.llistar();
                case 2 -> biblioteca.ordenarPerISBN();
                case 3 -> {
                        System.out.print("Autor: ");
                        biblioteca.buscarPerAutor(lector.nextLine());
                }
                case 4 -> {
                    System.out.print("ISBN: ");
                    biblioteca.buscarPerISBN(lector.nextLine());
                }
            }
            
        } while (opcio != 0);
    }
}

