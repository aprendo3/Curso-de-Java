package wildcards.limitesuperior;

import basico.Caja;

public class Main {
//    public static<T extends Number> void duplicar(Caja<T> caja) {
//        Number numero = caja.get();
//    }
    public static void duplicar(Caja<? extends Number> caja) {
        Number numero = caja.get();
        var duplicado = 2 * numero.doubleValue();
        System.out.printf("%f duplicado: %f%n", numero.doubleValue(), duplicado);
    }
    public static void main(String[] args) {
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.set(2);
        duplicar(cajaEntero);

        Caja<Double> cajaDoble = new Caja<>();
        cajaDoble.set(3.0);
        duplicar(cajaDoble);
    }
}
