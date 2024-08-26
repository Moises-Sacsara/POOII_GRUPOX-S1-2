package Clases;

public class Punto {
    private int coordenadaX;
    private int coordenadaY;
    
    //Constructor sin parametros
    public Punto() {
    }
    //Constructor con parametros
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
    //el (new punto(0, 0)) es usado como parametro
    public double getDistancia() {
        return getDistance(new Punto(0, 0));
    }
    //Utilizando la formula euclidiana pero entre 2 puntos
    public double getDistance(Punto otroPunto) {
        int x = this.coordenadaX - otroPunto.getCoordenadaX();
        int y = this.coordenadaY - otroPunto.getCoordenadaY();
        return Math.sqrt(x*x +y*y);
    }
    
    @Override
    public String toString(){
        return "El punto tiene las siguientes coordenadas: ("+ coordenadaX +","+ coordenadaY +")";
    }
    
}
