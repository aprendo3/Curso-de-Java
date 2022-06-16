package p64;

public class Nodo<T> {
    T dato;
    Nodo<T> sig;

    public Nodo(T dato) {
        this.dato = dato;
    }

    public String toString() {
        return "Nodo{" + "dato=" + dato +
                ", sig=" + sig + '}';
    }
}