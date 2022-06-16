package p71;
import static java.lang.System.out;
class A {
    void aprender() {
        out.println("Aprendo");
    }
}
class B extends A {
    @Override
    void Aprender() {
        out.println("Aprendo y me Suscribo");
    }
}
public class Main extends Object {
    public static void main(String[] args) {
        B i1 = new B();
        i1.aprender();
    }
}