package Gestio_notes;

public class Aula {

    private double[] notes;
    private int total = 0;

    public Aula(int capacitat) {
        this.notes = new double[capacitat];
    }

    //Afegir nota
    public void afegirNota(double nota) {

        if (this.total < this.notes.length) {
            notes[total] = nota;
            total++;
        } else {
            System.out.println("\nError. Aula plena.");
        }
    }

    //Nota mitjana
    public void notaMitjana() {
        if (this.total == 0) {
            System.out.println("\nEncara no hi ha notes.");
            return;
        }

        double suma = 0;
        for (int i = 0; i < total; i++) {
            suma += notes[i];
        }
        System.out.println("\nLa nota mitjana es de " + (suma / this.total) + ".");
    }

    //Histograma
    public void histograma() {
        int suspes = 0, aprovat = 0, notable = 0, excelent = 0;
        for (int i = 0; i < total; i++) {
            if (this.notes[i] < 5) {
                suspes++;
            } else if (notes[i] <= 6.5) {
                aprovat++;
            } else if (notes[i] <= 8.5) {
                notable++;
            } else {
                excelent++;
            }
        }
        System.out.print("\nSuspes: ");
        imprimirEstrelles(suspes);
        System.out.print("Aprovat: ");
        imprimirEstrelles(aprovat);
        System.out.print("Notable: ");
        imprimirEstrelles(notable);
        System.out.print("Excel.lent: ");
        imprimirEstrelles(excelent);
    }

    //Estrelles
    public void imprimirEstrelles(int nota) {
        for (int i = 0; i < nota; i++) {

            System.out.print("*");
        }
        System.out.println();
    }
}
