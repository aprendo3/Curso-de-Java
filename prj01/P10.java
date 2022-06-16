import static java.lang.System.out;
class P10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        boolean c = a == b;
        out.println(c);
        if (c) {
            out.format("%d == %d", a, b);
        }
        
        c = a > b;
        out.println(c);
        if (c) {
            out.format("%d > %d", a, b);
        }
        
        c = a < b;
        out.println(c);
        if (c) {
            out.format("%d < %d", a, b);
        }
    }
}