package p68;
import static java.lang.System.out;
class A {
    private int dato;
    protected void inc() {
        dato++;
    }
    public String toString() { return "Dato: " + dato ;}
}
class B extends A {
    public void test() {
        inc();
        out.println(this);
    }
}
public class Main extends Object {
    public static void main(String[] args) {
        B i1 = new B();
        //out.println(i1.dato);
        //i1.inc();
        i1.test();
    }
}