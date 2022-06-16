package p74;
import static java.lang.System.out;
import java.util.Iterator;
class CIterator implements Iterator<Integer> {
    int contador = 0;
    public boolean hasNext() {
        return contador < 3;
    }
    public Integer next() {
        return contador++;
    }
}
class C implements Iterable<Integer>{
    public Iterator<Integer> iterator() {
        return new CIterator();
    }
}
public class Main extends Object {
    public static void main(String[] args) {
        C c = new C();
        for (int i : c) {
            out.println(i);
        }
    }
}