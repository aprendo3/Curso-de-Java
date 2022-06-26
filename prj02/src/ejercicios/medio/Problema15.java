package ejercicios.medio;

/*
 * Invertir una lista enlazada, en un rango izq y der.
 * [1,2,3,4,5], left = 2, right = 4 ->
 * [1,4,3,2,5]
 *
 * [5], left = 1, right = 1
 */
public class Problema15 {
    public static void resolver() {
        ListaInt lista = new ListaInt(1, 2, 3, 4, 5);
        invertir(lista, 2, 4);
        System.out.println(lista);
    }

    private static void invertir(ListaInt lista, int izq, int der) {
        var ni = obtenerNodo(lista, izq);
        var nf = obtenerNodo(lista, der);
        for (; ni != nf; ni = ni.next) {
            int aux = ni.val;
            ni.val = nf.val;
            nf.val = aux;

            nf = anterior(lista, nf);
        }
    }

    private static ListNode obtenerNodo(ListaInt lista, int indice) {
        int i = 1;
        for (var actual = lista.raiz; actual != null; actual = actual.next) {
            if (i++ == indice) {
                return actual;
            }
        }
        return null;
    }

    private static ListNode anterior(ListaInt lista, ListNode nf) {
        for (var actual = lista.raiz; actual != null; actual = actual.next) {
            if (actual.next == nf) {
                return actual;
            }
        }
        return null;
    }
}
