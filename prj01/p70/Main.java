package p70;
import static java.lang.System.out;
abstract class A { 
    abstract void aprender();
}
class B extends A {
    void aprender() {
        out.println("Aprendo");
    }
}
public class Main extends Object {
    public static void main(String[] args) {
        B i1 = new B();
        i1.aprender();
    }
}