package basico;
import java.util.Arrays;

import static java.lang.System.out;
class Generico<T> {
    T dato;
    public T test(T dato) {
        return dato;
    }
}
public class Main {
    public static void main(String[] args) {
        Generico<String> n1 = new Generico<String>();
        out.println(n1.test("Aprendo"));
        Generico<int[]> n2 = new Generico<int[]>();
        out.println(Arrays.toString(n2.test(new int[]{1, 2, 3})));
        // Generico<int> n3 = new Generico<int>();
        // out.println(n3.test(1));
        Generico<Integer> n3 = new Generico<Integer>();
        out.println(n3.test(1));

        Caja<Integer> cajaEntero = new Caja<Integer>();
        cajaEntero.set(1);
        out.println(cajaEntero.get());
    }
}
