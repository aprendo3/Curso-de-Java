package p67;
import static java.lang.System.out;
class A extends Object{
    public int sumar(int a, int b) {
        return a + b;
    }
}
class B extends A {
    
}
class C extends B {
    
}
public class Main extends Object {
    public static void main(String[] args) {
        A i1 = new A();
        out.println(i1.sumar(2, 3));
        B i2 = new B();
        out.println(i2.sumar(2, 3));
        C i3 = new C();
        out.println(i3.sumar(2, 3));
        out.println(i1.toString());
        out.println(i1.getClass());
        out.println(i1.hashCode());
        out.println(i1.equals(i2));
    }
}