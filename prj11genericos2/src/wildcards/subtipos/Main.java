package wildcards.subtipos;

import basico.Caja;

public class Main {
    public static void main(String[] args) {
        Caja<Integer> cajaEntero = new Caja<>();
        //Caja<Number> cajaNumero = cajaEntero;
        Caja<?> cajaEntero2 = new Caja<Integer>();
        Caja<?> cajaNumero2 = new Caja<Number>();
        // Caja<?> <- Caja<Integer>
        // Caja<?> <- Caja<Number>
        Caja<? extends Integer> cajaEntero3 = new Caja<>();
        Caja<? extends Number> cajaNumero3 = cajaEntero3;
        //Caja<?> <- Caja<? extends Number> <- Caja<? extends Integer> <- Caja<Integer>
    }
}
