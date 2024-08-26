package pooii.grupox.s1.pkg2;

import Clases.Punto;
import Clases.SuperficiePlana;
import Clases.Triangulo;

public class POOIIGRUPOXS12 {

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);

        Triangulo trian = new Triangulo("Triangulo",p1, p2, p3);
        
        System.out.println(trian.toString());
        
        System.out.println("Area del triangulo es: "+trian.calcularArea());
        System.out.println("Regular: "+trian.regular());
        
        System.out.println("**********************************************");
        SuperficiePlana superfi=new SuperficiePlana();
        superfi.devolverArea();
    }
    
}
