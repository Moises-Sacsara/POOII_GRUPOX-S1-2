package Clases;

public class Triangulo extends FiguraGeometrica{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    //Constructor sin parametros
    public Triangulo(String nombreFigura) {    
        super(nombreFigura);
    }

    //Constructor con parametros, llamando a la super clase
    public Triangulo(String nombreFigura, Punto punto1, Punto punto2, Punto punto3) {
        super(nombreFigura);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    @Override
    public double calcularArea() {
        double lado1 = punto1.getDistance(punto2);
        double lado2 = punto2.getDistance(punto3);
        double lado3 = punto3.getDistance(punto1);
        //Hallamos el semiperimetro
        double semiperimetro = (lado1+lado2+lado3)/2;
        //Usando la formula de heron
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }
    //Comprobamos si la figura es regular
    @Override
    public boolean regular() {
        double lado1 = punto1.getDistance(punto2);
        double lado2 = punto2.getDistance(punto3);
        double lado3 = punto3.getDistance(punto1);
        return lado1 == lado2 && lado2 == lado3;
    }
    
    @Override
    public String toString() {
        return getNombreFigura()+":" +
               " tiene 3 Puntos \n"
                + getPunto1().toString() + ", " +"\n"
                + getPunto2().toString() + ", " + "\n"
                + getPunto3().toString();
    }
    
    /*
    4. Identificar las clases que heredan, ¿qué atributos y métodos heredan?
    Respuesta: 
    - La clase Triangulo hereda de la clase FiguraGeométrica.
    - la clase Trinagulo hereda los atributos de la clase FiguraGeometrica
    - La clase Triangulo hereda los metodos de la clase FiguraGeometrica (getNombreFigura
    calcularArea, regular); los 2 ultimos la clase triangulo los implementara a su manera
    *****************************************************************************************
    5. Identificar las clases que conforman una composición.
    Respuesta: La clase triangulo y la clase punto
    *****************************************************************************************
    6. ¿Qué es una superclase y una subclase?
    Respuesta: 
    - Suoerclase es como el padre y una subclase es como el hijo; este ultimo hereda los atributos
    y metodos del superclase
    *****************************************************************************************
    7. ¿Por qué usamos abstract? ¿Se puede dejar de heredar un método de una clase abstracta?
    Respuesta: Es un metodo heredado, que es usado por la subclase, pero este los implementara de otra manera,
    se crea en la superclase pero no es instanciada directamente por la subclase
    *****************************************************************************************
    8. ¿Qué anotación utilizo para sobreescribir métodos?
    Respuesta: @Override
    *****************************************************************************************
    9. Los atributos de la clase Figura Geométrica conviértalas en protected. ¿En qué condición 
    convierte a los atributos? ¿Es posible acceder a los atributos protegidos sin utilizar una 
    invocación a super() o sin método get?.
    Respuesta: Estos pueden ser accedidos dentro del mismo paquete y pueden ser heredados por las subclases
    sin necesidad de super o get
    *****************************************************************************************
    10. ¿Cómo aplicarías polimorfismo?.
    Respuesta: Los aplicaria atravez de la herencia y la interfaz.
    */
    
}
