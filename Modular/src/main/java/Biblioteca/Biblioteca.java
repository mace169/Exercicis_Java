package Biblioteca;

public class Biblioteca {

    private Llibre[] llibres;
    private int total;

    public Biblioteca(int capacitat) {
        llibres = new Llibre[capacitat];
        total = 0;
    }

    //Afegir llibre
    public void afegirLlibre(Llibre l) {
        if (total < llibres.length) {
            llibres[total] = l;
            total++;
        }
    }

    //Llistar llibres
    public void llistar() {
        System.out.println("\n------------------------------------------------------------------------------------------");
        for (int i = 0; i < total; i++) {
            System.out.println(
                    llibres[i].getIsbn() + " - "
                    + llibres[i].getTitol() + " - "
                    + llibres[i].getAutor() + " - "
                    + llibres[i].getEditorial()
            );
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
    
    //Ordenar per ISBN
    public void ordenarPerISBN() {
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (llibres[i].getIsbn().compareTo(llibres[j].getIsbn()) > 0) {
                    
                    Llibre aux = llibres[i];
                    llibres[i] = llibres[j];
                    llibres[j] = aux;
                }
            }
        }
    }
    
    //Buscar per autor
    public void buscarPerAutor(String autor) {
        boolean trobat = false;
        
        for (int i = 0; i < total; i++) {
            if (llibres [i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println(
                        llibres[i].getTitol() +
                                " (" + llibres[i].getIsbn() + ")"
                );
                trobat = true;
            }
        }
        
        if (!trobat) {
            System.out.println("Cap llibre d'aquest autor.");
        }
    }
    
    //Buscar per ISBN
    public void buscarPerISBN(String isbn) {
        for (int i = 0; i < total; i++) {
            if (llibres[i].getIsbn().equals(isbn)) {
                System.out.println(
                        "Llibre trobat: " + llibres[i].getTitol()
                );
                return;
            }
        }
        
        System.out.println("ERROR: llibre no existent.");
    }
}
