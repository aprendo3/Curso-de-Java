package p64;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<Integer>(1, 2, 3, 4, 5);
        out.println(lista);
        lista.agregar(6);
        out.println(lista);
        lista.remover(2);
        out.println(lista);

        Lista<String> l2 = new Lista<String>("Hola", "Aprendo");
        out.println(l2);
    }
}
