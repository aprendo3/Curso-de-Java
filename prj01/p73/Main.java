package p73;
import static java.lang.System.out;
class A { 
    int uno() { 
        return 1; 
    } 
}
class B extends A { 
    int uno() { 
        return 2; 
    } 
}
public class Main extends Object {
    public static void main(String[] args) {
        test(new B());
    }
    static void test(A a) { 
        out.println(a.uno()); 
    }
}