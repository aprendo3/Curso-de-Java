package wildcards.limiteinferior;

import basico.Caja;

public class Main {
    public static void empaquetarEnteroCero(Caja<Integer> caja) {
        int entero = 10;
        caja.set(entero);
    }
    public static void empaquetarEntero(Caja<? super Integer> caja) {
        int entero = 10;
        caja.set(entero);
    }
    public static void main(String[] args) {
        Caja<Number> cajaNumero = new Caja<>();
        empaquetarEntero(cajaNumero);
        System.out.println(cajaNumero.get());

        Caja<Integer> cajaEntero = new Caja<>();
        empaquetarEntero(cajaEntero);
        System.out.println(cajaEntero.get());
    }
}
