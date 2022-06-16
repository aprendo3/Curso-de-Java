import static java.lang.System.out;
public class P49 {
    static int sumar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int r = sumar(1, 2);
        out.println(r);
        r = sumar(10, 5);
        out.println(r);
        out.println(sumar(50, 1));
    }
}
