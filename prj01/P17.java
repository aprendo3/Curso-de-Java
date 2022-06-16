import static java.lang.System.out;
class P17 {
    public static void par(int a) {
        if (a % 2 == 0) {
            out.format("%d es par %n", a);
        } else {
            out.format("%d es impar %n", a);
        }
    }
    public static void main(String[] args) {
        par(2);
        par(3);
        par(50);
        par(111);
        par(1024);
    }
}