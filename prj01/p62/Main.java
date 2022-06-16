package p62;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        ListaInt lista = new ListaInt(1, 2, 3, 4, 5);
        out.println(lista);
        lista.agregar(6);
        out.println(lista);
        lista.remover(2);
        out.println(lista);
    }
}