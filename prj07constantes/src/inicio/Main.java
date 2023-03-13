package inicio;

class Persona {
    final int ID = 1;
    final String nombre;
    //static final String TIPO = "Persona";
    static final String TIPO;

    Persona(String nombre) {
        this.nombre = nombre;
    }
    static {
        TIPO = "Persona";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.printf("PI: %f %n", Math.PI);
        System.out.printf("Entero Maximo: %d %n", Integer.MAX_VALUE);
        //Math.PI = 3.1416;
        final double PI = 3.1416;
        double radio = 2.0;
        double area = PI * radio * radio;
        System.out.printf("area de un circulo con radio %f, es: %f %n",
                radio, area);
    }
}
