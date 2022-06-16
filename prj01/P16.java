import static java.lang.System.out;
class P16 {
    public static void main(String[] args) {
        int a = 2;
        if (a % 2 == 0) {
            out.format("%d es par %n", a);
        } else {
            out.format("%d es impar %n", a);
        }
        
        a = 3;
        if (a % 2 == 0) {
            out.format("%d es par %n", a);
        } else {
            out.format("%d es impar %n", a);
        }
        
        a = 50;
        if (a % 2 == 0) {
            out.format("%d es par %n", a);
        } else {
            out.format("%d es impar %n", a);
        }
    }
}