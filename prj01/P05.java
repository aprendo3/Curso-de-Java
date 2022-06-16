import static java.lang.System.out;
class P05 {
    public static void main(String[] args) {
        int a = 1;
        out.println(a);
        int b = 2;
        out.println(b);
        int c = a + b;
        out.println(c);
        out.format("%d + %d = %d", a, b, c);
    }
}