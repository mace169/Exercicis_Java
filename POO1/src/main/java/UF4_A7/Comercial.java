package UF4_A7;

public class Comercial extends Empleat {

    //Atributs
    private String ciutat;
    private String productesVenuts = "";
    private double totalVendes = 0;

    //Constructor
    public Comercial(String nif, String nom, String telefon, String ciutat) {
        super(nif, nom, telefon);
        this.ciutat = ciutat;
    }
    
    //Constructor sense telefon
    public Comercial(String nif, String nom, String ciutat) {
        super(nif, nom);
        this.ciutat = ciutat;
    }

    //Getters i setters
    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    //Getter retorna una array dels productes venuts (si no es null o esta buida)
    public String[] getProductesVenuts() {
        if (this.productesVenuts == null || this.productesVenuts.isEmpty()) {
            return new String[0];
        }

        return this.productesVenuts.split(", ");
    }

    public void setProductesVenuts(String productesVenuts) {
        this.productesVenuts = productesVenuts;
    }

    public double getTotalVendes() {
        return totalVendes;
    }

    public void setTotalVendes(double totalVendes) {
        this.totalVendes = totalVendes;
    }

    //Metode per vendre productes
    public void vendaProducte(String producte, double preu) {
        if (this.productesVenuts.isEmpty()) {
            this.productesVenuts += producte;
        } else {
            this.productesVenuts += ", " + producte;
        }

        this.totalVendes += preu;
    }

    //Metode per imprimir
    @Override
    public String toString() {

        return super.toString()
                + "\nCiutat: " + this.ciutat
                + "\nProductes venuts: " + this.productesVenuts
                + "\nTotal vendes: " + this.totalVendes + " euros.";
    }

}
