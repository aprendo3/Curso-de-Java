package p69;
import static java.lang.System.out;
class A {
    public void aprender() {
        out.println("Aprendo");
    }
}
class B extends A {
    public void saludar() {
        out.println("Hola");
    }
}
public class Main extends Object {
    public static void main(String[] args) {
        A i1 = new B();
        B i2 = (B)i1;
        //((B)i1).saludar();
        i2.saludar();
        i1.aprender();
    }
}