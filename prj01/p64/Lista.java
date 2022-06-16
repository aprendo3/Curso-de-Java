package p64;

public class Lista<T> {
    private Nodo<T> raiz;
    private Nodo<T> ultimo;
    private int longitud;
    public Lista() { }
    public Lista(T... datos) {
        for (T dato : datos) {
            agregar(dato);
        }
    }
    public void agregar(T dato) {
        Nodo<T> nodo = new Nodo<T>(dato);
        if (ultimo == null) {
            raiz = nodo;
        } else {
            ultimo.sig = nodo;
        }
        ultimo = nodo;
        longitud++;
    }
    public T obtener(int indice) {
        if (indice >= 0 && indice < longitud) {
            Nodo<T> nodo = raiz;
            for (int i = 0; i < longitud && i != indice; i++) {
                nodo = nodo.sig;
            }
            return nodo.dato;
        }
        return null;
    }
    public void remover(T dato) {
        for (Nodo<T> n = raiz, a = raiz;
             n != null ;
             a = n, n = n.sig) {
            if (n.dato == dato) {
                if (n == raiz) {
                    raiz = raiz.sig;
                }
                a.sig = n.sig;
                break;
            }
        }
        longitud--;
    }
    public String toString() { return raiz.toString(); }
}
