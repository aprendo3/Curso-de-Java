package herencia;

import basico.Caja;

public class Main {
    public static void test(Number n) {  }
    public static void cajaTest(Caja<Number> n) {  }
    public static void main(String[] args) {
        Object obj = new Object();
        Integer num = Integer.valueOf(10);
        obj = num;
        test(1);
        test(1.1);
        Caja<Number> caja = new Caja<Number>();
        caja.set(Integer.valueOf(10));
        caja.set(Double.valueOf(10));
        cajaTest(caja);
        Caja<Integer> cajaInt = new Caja<Integer>();
        Caja<Double> cajaDou = new Caja<Double>();
        //cajaTest(cajaInt);
        //cajaTest(cajaDou);
        // Number <- Integer
        // Object <- Caja<Number>
        // Object <- Caja<Integer>
        // Caja<Number> <- Caja<Integer> X

    }
}
