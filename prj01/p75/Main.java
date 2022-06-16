package p75;
import java.util.List;
import static java.lang.System.out;
interface A { void tarea(); }
class B implements A {
    public void tarea() {
        out.println("Aprendo");
    }
}
class C implements A {
    public void tarea() {
        out.println("Me Susbribo");
    }
}
public class Main {
    public static void main(String[] args) {
        List<A> lista = List.of(new B(), new C());
        test(lista);
    }
    public static void test(List<A> lista) {
        for (A a : lista) {
            a.tarea();
        }
    }
}
