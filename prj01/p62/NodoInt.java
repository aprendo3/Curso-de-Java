package p62;

public class NodoInt {
    int dato;
    NodoInt sig;

    public NodoInt(int dato) {
        this.dato = dato;
    }

    public String toString() {
        return "Nodo{" + "dato=" + dato +
                ", sig=" + sig + '}';
    }
}
