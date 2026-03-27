package UF4_A1;

public class TestPunt {
    public static void main(String[] args) {
        Punt p1 = new Punt();
        System.out.println("P1 = (" +p1.getY()+ ", " +p1.getX()+ ")");
        Punt p2 = new Punt(5,3);
        System.out.println("P2 = (" +p2.getY()+ ", " +p2.getX()+ ")");
        Punt p3 = new Punt(2,-1);
        System.out.println("P3 = (" +p3.getY()+ ", " +p3.getX()+ ")");
        
        double mitjaX = (p2.getY() + p3.getY()) / 2;
        double mitjaY = (p2.getX() + p3.getX()) / 2;
        
        Punt p4 = new Punt (mitjaY, mitjaX);
        System.out.println("P4 = (" +p4.getX()+ ", " +p4.getY()+ ")");

        Punt.calculDistancia(p2.getY(), p2.getX(), p3.getY(), p3.getX());
    }
}
