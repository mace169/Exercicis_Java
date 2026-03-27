package UF4_A1;

public class Punt {

    private double y;
    private double x;

    public Punt(double y, double x) {

        this.y = y;
        this.x = x;
    }

    public Punt() {

    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    public static void calculDistancia(double y1, double x1, double y2, double x2) {
        double distanciaY = Math.pow(y2 - y1, 2);
        double distanciaX = Math.pow(x2 - x1, 2);
        double dist = Math.sqrt(distanciaY + distanciaX);
        System.out.print("La distancia entre P2 i P3 és: " + dist);
    }
}
