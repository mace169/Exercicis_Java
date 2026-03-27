package Radiografies;

import java.time.LocalDate;
import java.util.Scanner;

public class Hospital {

    static Pacient[] pacients;
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        inicialitzarDades();

        int opcio = -1;

        do {
            System.out.println("\n--- GESTIO HOSPITAL ---");
            System.out.println("1. Pacients amb radiografia per dates");
            System.out.println("2. Buscar pacient per Codi SS");
            System.out.println("0. Sortir");
            System.out.print("Opcio: ");

            try {
                opcio = lector.nextInt();
                lector.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR: Format no valid.");
                lector.nextLine();
            }

            switch (opcio) {
                case 1:
                    try {
                        System.out.print("Data inici (AAAA-MM-DD): ");
                        LocalDate inici = LocalDate.parse(lector.nextLine());
                        System.out.print("Data final (AAAA-MM-DD): ");
                        LocalDate fi = LocalDate.parse(lector.nextLine());
                        radiografiesTemps(inici, fi);
                    } catch (Exception e) {
                        System.out.println("ERROR: Format de data no valid.");
                    }
                    break;
                case 2:
                    System.out.print("Introdueix Codi SS: ");
                    String codi = lector.nextLine();
                    dadesPacient(codi);
            }

        } while (opcio != 0);
    }

    public static void inicialitzarDades() {
        pacients = new Pacient[3];
        pacients[0] = new Pacient("Pere Sans", "111111111", "44555666", LocalDate.of(2007, 5, 3), 'n');
        pacients[1] = new Pacient("Anna Pou", "222222222", "12345678", LocalDate.of(2023, 10, 15), 's');
        pacients[2] = new Pacient("Joan Marc", "333333333", "87654321", LocalDate.of(2023, 11, 20), 's');
    }

    public static void radiografiesTemps(LocalDate datainici, LocalDate datafinal) {
        if (!datainici.isBefore(datafinal)) {
            System.out.println("ERROR: La data d'inici no es anterior a la data final.");
        } else {
            System.out.println("\nPacients amb radiografia entre " + datainici + " i " + datafinal + ":");
            for (Pacient p : pacients) {

                if (p.getRadiografia() == 's' || p.getRadiografia() == 'S') {
                    if ((p.getDataIngres().isAfter(datainici) || p.getDataIngres().isEqual(datainici))
                            && (p.getDataIngres().isBefore(datafinal) || p.getDataIngres().isEqual(datafinal))) {
                        System.out.println("- " + p.getNom());
                    }
                }
            }
        }
    }

    public static void dadesPacient(String numsegsocial) {
        boolean trobat = false;
        for (Pacient p : pacients) {
            if (p.getCodiSS().equals(numsegsocial)) {
                trobat = true;

                String[] mesos = {"gener", "febrer", "març", "abril", "maig", "juny",
                    "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};
                String mesCatala = mesos[p.getDataIngres().getMonthValue() - 1];

                System.out.println("\nDades del pacient amb codi SS: " + p.getCodiSS());
                System.out.println("Nom: " + p.getNom());
                System.out.println("DNI: " + p.getDni());
                System.out.println("Data d'ingres: " + p.getDataIngres().getDayOfMonth() + " de " + mesCatala + " de " + p.getDataIngres().getYear());

                if (p.getRadiografia() == 's' || p.getRadiografia() == 'S') {
                    System.out.println("Li han fet radiografies");
                } else {
                    System.out.println("No li han fet radiografies");
                }
                break;
            }
        }
        if (!trobat) {
            System.out.println("ERROR: No existeix cap pacient amb el codi " + numsegsocial);
        }
    }
}
