package Clases;

import java.util.List;

public class SuperficiePlana{
    private List<FiguraGeometrica> figurasGeome;

    public SuperficiePlana() {
    }

    public SuperficiePlana(List<FiguraGeometrica> figurasGeome) {
        this.figurasGeome = figurasGeome;
    }
    
    public void devolverArea(){
        if (figurasGeome == null || figurasGeome.isEmpty()) {
            System.out.println("No hay figuras para mostrar.");
            return;
        }
        
        
        for (FiguraGeometrica figura : figurasGeome) {
            String nombre = figura.getNombreFigura();
            double area = figura.calcularArea();
            System.out.printf("Figura: "+nombre+" => "+area);
        }
    }  
    
}
