package ejercicios.medio;

/*
 * Rotar una lista enlazada k lugares
 * ej:
 * [1,2,3,4,5], k = 2 -> [4,5,1,2,3]
 *
 * [0,1,2], k = 4 -> [2,0,1]
 */
public class Problema14 {
    public static void resolver() {
        ListaInt lista = new ListaInt(1, 2, 3, 4, 5);
        rotar(lista, 2);
        System.out.println(lista);

        lista = new ListaInt(0, 1, 2);
        rotar(lista, 4);
        System.out.println(lista);
    }

    private static void rotar(ListaInt lista, int k) {
        for (int i = 0; i < k; i++) {
            int aux = lista.ultimo.val;
            for (var actual = lista.raiz; actual != null; actual = actual.next) {
                int aux2 = actual.val;
                actual.val = aux;
                aux = aux2;
            }
        }
    }
}
