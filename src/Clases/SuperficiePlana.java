package Clases;

import java.util.List;

public class SuperficiePlana {
    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana(List<FiguraGeometrica> figurasGeometricas) {
        this.figurasGeometricas = figurasGeometricas;
    }
    
    public void devolverArea(){
        for (FiguraGeometrica figura : figurasGeometricas) {
            System.out.println("Area de la figura " + figura.getNombreFigura() + " => " + figura.calcularArea());
        }
    }
    
    
}
