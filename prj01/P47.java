import static java.lang.System.out;
public class P47 {
    static void aprendo() {
        out.println("Aprendo");
    }
    static int uno() {
        return 1;
    }
    static int eco(int a) {
        return a;
    }
    public static void main(String[] args) {
        aprendo();
        int a = uno();
        out.println(a);
        out.println(uno());
        out.println(eco(3));
        out.println(eco(4));
        out.println(eco(uno()));
        out.println(eco(eco(uno())));
    }
}
