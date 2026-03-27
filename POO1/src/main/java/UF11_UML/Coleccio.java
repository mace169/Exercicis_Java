package UF11_UML;

public class Coleccio {

    //Atributs
    private Multimedia[] llista;
    private int total = 0;
    private int numColeccio = 0;
    
    //Constructor
    public Coleccio (int total){
        this.total = total;
        this.llista = new Multimedia[total];
    }

    //Setters i getters
    public Multimedia[] getLlista() {
        return llista;
    }

    public void setLlista(Multimedia[] llista) {
        this.llista = llista;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    //Metode per afegir pelicules a la coleccio
    public boolean afegirMulti(Multimedia pelicula){
        
        //Si la llista no esta plena afegim la pelicula
        if (this.numColeccio < this.total){
            this.llista[numColeccio] = pelicula;
            this.numColeccio++;
            return true;
        }
        
        //Si esta plena...
        return false;
    }
    
    //Metode per llistar la coleccio
    public void llistarMulti(){
        if (this.numColeccio == 0){
            System.out.println("Llista buida");
        }else{
            for(int i = 0; i < this.numColeccio; i++){
                System.out.println(llista[i]);
            }
        }
    }
}
