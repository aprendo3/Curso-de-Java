import static java.lang.System.out;
public class P48 {
    static int duplicar(int a) {
        int d = 2 * a;
        return d;
    }
    public static void main(String[] args) {
        int a = duplicar(2);
        out.println(a);
        out.println(duplicar(4));
        out.println(duplicar(33));
    }
}
