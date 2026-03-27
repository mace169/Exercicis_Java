package UF4_A5;

public class Rectangle {

    private double base = 1;
    private double altura = 1;
    private double y = 0;
    private double x = 0;

    // Constructors
    public Rectangle() {
    }

    public Rectangle(double base) {
        // "?" = si lo de abans es no es cumpleix fes lo seguent
        this.base = (base > 0) ? base : 1;
        this.altura = (base > 0) ? base : 1;

    }

    public Rectangle(double base, double altura) {
        this.base = (base > 0) ? base : 1;
        this.altura = (altura > 0) ? altura : 1;
    }

    public Rectangle(double base, double altura, double y, double x) {
        this.base = (base > 0) ? base : 1;
        this.altura = (altura > 0) ? altura : 1;
        this.y = y;
        this.x = x;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    // Metode per calcular l'area
    public double area() {

        return this.base * this.altura;
    }

    //Metode per calcular el perimetre
    public double perimetre() {

        return 2 * (this.base + this.altura);
    }

    public void trasllada(double novaY, double novaX) {

        this.y += novaY;
        this.x += novaX;
    }

    public void redimensionar() {

        this.base += 1;
        this.altura += 1;
    }

    public boolean redimensionar(double numBase, double numAlt) {

        double novaBase = this.base + numBase;
        double novaAlt = this.altura + numAlt;

        // Si es pot redimensionar retornem true
        if (novaBase > 0 && novaAlt > 0) {
            this.base = novaBase;
            this.altura = novaAlt;
            return true;
        }
        // Si no es pot retornem false
        return false;
    }

    public boolean redimensionar(double num) {

        // Aprofitem el metode anterior
        return redimensionar(num, num);
    }
    
    // Farem servir el metode toString per imprimir els rectangles
    @Override
    public String toString (){
        return "Base: " +this.base+
                "\nAltura: " +this.altura+
                "\nPosicio: y:" +this.y+ ", x:" +this.x+
                "\nArea: " +this.area()+
                "\nPerimetre: " +this.perimetre();
    }
}
