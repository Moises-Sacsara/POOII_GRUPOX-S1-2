package Clases;

public class Punto {
    private int coordenadaX;
    private int coordenadaY;

    public Punto() {
    }

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    /*public double getDistancia(){
        
    }*/
    
    @Override
    public String toString(){
        return "("+ coordenadaX +","+ coordenadaY +")";
    }
    
}
