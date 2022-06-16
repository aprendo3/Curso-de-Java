import static java.lang.System.out;
class P12 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        if (a == b) {
            out.format("%d == %d", a, b);
        } else if (a > b) {
            out.format("%d > %d", a, b);
        } else {
            out.format("%d < %d", a, b);
        }
    }
}