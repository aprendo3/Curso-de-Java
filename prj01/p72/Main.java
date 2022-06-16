package p72;
import static java.lang.System.out;
interface A {}
interface AA {}
class B {
}
class C extends B implements A, AA {
    public void aprender() {
        out.println("Aprendo");
    }
}
public class Main extends Object {
    public static void main(String[] args) {
        C i1 = new C();
        i1.aprender();
    }
}