package p62;
//lista.agregar() | lista.obtener() | lista.remover()
public class ListaInt {
    private NodoInt raiz;
    private NodoInt ultimo;
    private int longitud;
    public ListaInt() { }
    public ListaInt(int... datos) {
        for (int dato : datos) {
            agregar(dato);
        }
    }
    public void agregar(int dato) {
        NodoInt nodo = new NodoInt(dato);
        if (ultimo == null) {
            raiz = nodo;
        } else {
            ultimo.sig = nodo;
        }
        ultimo = nodo;
        longitud++;
    }
    public int obtener(int indice) {
        if (indice >= 0 && indice < longitud) {
            NodoInt nodo = raiz;
            for (int i = 0; i < longitud && i != indice; i++) {
                nodo = nodo.sig;
            }
            return nodo.dato;
        }
        return -1;
    }
    public void remover(int dato) {
        for(NodoInt nodo = raiz, anterior = raiz;
            nodo != null;
            anterior = nodo, nodo = nodo.sig) {
            if (nodo.dato == dato) {
                if (nodo == raiz) {
                    raiz = raiz.sig;
                }
                anterior.sig = nodo.sig;
                break;
            }
        }
        longitud--;
    }
    public String toString() { return raiz.toString(); }
}