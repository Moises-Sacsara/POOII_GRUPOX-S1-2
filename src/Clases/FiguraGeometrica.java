package Clases;

public abstract class FiguraGeometrica {
    private String nombreFigura;

    public FiguraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }


    public abstract double calcularArea();
    public abstract boolean regular();

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    
    
    
}
