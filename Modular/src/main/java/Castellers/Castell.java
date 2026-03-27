package Castellers;

public class Castell {
    private int codi;
    private String descripcio;
    private int puntsCarregats;
    private int puntsDescarregats;

    public Castell(int codi, String descripcio, int puntsCarregats, int puntsDescarregats) {
        this.codi = codi;
        this.descripcio = descripcio;
        this.puntsCarregats = puntsCarregats;
        this.puntsDescarregats = puntsDescarregats;
    }

    /**
     * @return the codi
     */
    public int getCodi() {
        return codi;
    }

    /**
     * @param codi the codi to set
     */
    public void setCodi(int codi) {
        this.codi = codi;
    }

    /**
     * @return the descripcio
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * @param descripcio the descripcio to set
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * @return the puntsCarregats
     */
    public int getPuntsCarregats() {
        return puntsCarregats;
    }

    /**
     * @param puntsCarregats the puntsCarregats to set
     */
    public void setPuntsCarregats(int puntsCarregats) {
        this.puntsCarregats = puntsCarregats;
    }

    /**
     * @return the puntsDescarregats
     */
    public int getPuntsDescarregats() {
        return puntsDescarregats;
    }

    /**
     * @param puntsDescarregats the puntsDescarregats to set
     */
    public void setPuntsDescarregats(int puntsDescarregats) {
        this.puntsDescarregats = puntsDescarregats;
    }
    
    
}

