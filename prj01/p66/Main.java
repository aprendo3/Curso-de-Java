package p66;
import static java.lang.System.out;
class A {
    int dato;
    public void mostrarDato() {
        out.println(dato);
    }
}
class B extends A {
    
}
public class Main {
    public static void main(String[] args) {
        B i1 = new B();
        out.println(i1.dato++);
        i1.mostrarDato();
    }
}