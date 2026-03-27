package Castellers;

public class Colla {
    private String nom;
    private String localitat;
    private int[] codisCastellsPrincipals;

    public Colla(String nom, String localitat, int[] codisCastellsPrincipals) {
        this.nom = nom;
        this.localitat = localitat;
        this.codisCastellsPrincipals = codisCastellsPrincipals;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the localitat
     */
    public String getLocalitat() {
        return localitat;
    }

    /**
     * @param localitat the localitat to set
     */
    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    /**
     * @return the codisCastellsPrincipals
     */
    public int[] getCodisCastellsPrincipals() {
        return codisCastellsPrincipals;
    }

    /**
     * @param codisCastellsPrincipals the codisCastellsPrincipals to set
     */
    public void setCodisCastellsPrincipals(int[] codisCastellsPrincipals) {
        this.codisCastellsPrincipals = codisCastellsPrincipals;
    }

    
}
