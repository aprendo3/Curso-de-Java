package ejercicios.medio;

public class ListaInt {
    public ListNode raiz;
    public ListNode ultimo;
    private int longitud;
    public ListaInt() { }
    public ListaInt(int... datos) {
        for (int dato : datos) {
            agregar(dato);
        }
    }
    public void agregar(int dato) {
        ListNode nodo = new ListNode(dato);
        if (ultimo == null) {
            raiz = nodo;
        } else {
            ultimo.next = nodo;
        }
        ultimo = nodo;
        longitud++;
    }

    public String toString() { return raiz.toString(); }
}
