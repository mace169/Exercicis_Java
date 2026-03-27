package Radiografies;

import java.time.LocalDate;
import java.util.Scanner;

public class Pacient {
    private String nom;
    private String codiSS;
    private String dni;
    private LocalDate dataIngres;
    private char radiografia;

    public Pacient(String nom, String codiSS, String dni, LocalDate dataIngres, char radiografia) {
        this.nom = nom;
        this.codiSS = codiSS;
        this.dni = dni;
        this.dataIngres = dataIngres;
        this.radiografia = radiografia;
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
     * @return the codiSS
     */
    public String getCodiSS() {
        return codiSS;
    }

    /**
     * @param codiSS the codiSS to set
     */
    public void setCodiSS(String codiSS) {
        this.codiSS = codiSS;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the dataIngres
     */
    public LocalDate getDataIngres() {
        return dataIngres;
    }

    /**
     * @param dataIngres the dataIngres to set
     */
    public void setDataIngres(LocalDate dataIngres) {
        this.dataIngres = dataIngres;
    }

    /**
     * @return the radiografia
     */
    public char getRadiografia() {
        return radiografia;
    }

    /**
     * @param radiografia the radiografia to set
     */
    public void setRadiografia(char radiografia) {
        this.radiografia = radiografia;
    }
    
    
}
