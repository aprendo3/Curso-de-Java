package p61;
import static java.lang.System.out;
class Nodo {
    public int dato;
    public Nodo sig;
    public Nodo(int dato) {
        this.dato = dato;
    }
    public String toString() {
        return "Nodo{" + "dato=" + dato +
                ", sig=" + sig + '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);
        Nodo n2 = new Nodo(2);
        raiz.sig = n2;
        Nodo n3 = new Nodo(3);
        n2.sig = n3;
        Nodo n4 = new Nodo(4);
        n3.sig = n4;
        Nodo n5 = new Nodo(5);
        n4.sig = n5;
        out.println(raiz);
    }
}