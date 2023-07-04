package wildcards.sinlimites;

import basico.Caja;

public class Main {
    public static <T> void imprimirContenidoCero(Caja<T> caja) {
        System.out.println(caja.get());
    }
    public static void imprimirContenidoObj(Caja<Object> caja) {
        System.out.println(caja.get());
    }
    public static void imprimirContenido(Caja<?> caja) {
        System.out.println(caja.get());
    }
    public static void main(String[] args) {
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.set(2);
        //imprimirContenidoObj(cajaEntero);
        imprimirContenido(cajaEntero);

        Caja<String> cajaCadena = new Caja<>();
        cajaCadena.set("Aprendo");
        imprimirContenido(cajaCadena);
    }
}
