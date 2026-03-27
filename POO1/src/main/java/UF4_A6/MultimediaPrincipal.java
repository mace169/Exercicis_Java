package UF4_A6;

public class MultimediaPrincipal {

    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("American Gangster", "Ridley Scott", "DVD", 157, "Denzel Washington", "Carla Gugino");
        Pelicula p2 = new Pelicula("American Gangster", "Ridley Scott", "Video VHS", 157, "Denzel Washington", "Carla Gugino");
        Pelicula p3 = new Pelicula("Blade Runner", "Ridley Scott", "Video VHS", 117, "Harrison Ford", "Sean Young");

        Pelicula[] pelicules = {p1, p2, p3};

        for (int i = 0; i < pelicules.length; i++) {
            System.out.println(pelicules[i]);
        }
    }
}
