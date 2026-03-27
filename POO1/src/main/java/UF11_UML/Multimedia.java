package UF11_UML;

abstract class Multimedia {

    //Atributs
    private String titol;
    private String autor;
    private String format;
    private int durada;
    
    //Constructor
    public Multimedia(String titol, String autor, String format, int durada){
        this.titol = titol;
        this.autor = autor;
        this.format = format;
        this.durada = durada;
    }
    
    //Getters i setters
    public String getTitol (){
        return this.titol;
    }
    
    public void setTitol (String titol){
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDurada() {
        return durada;
    }

    public void setDurada(int durada) {
        this.durada = durada;
    }
    
    //Metode toString per imprimir els atributs de multimedia
    @Override
    public String toString(){
        
        return "\nTitol: " +this.titol
                + "\nAutor: " +this.autor
                + "\nFormat: " +this.format
                + "\nDurada (segons): " +this.durada;
    }
    
}
