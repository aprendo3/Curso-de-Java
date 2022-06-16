import static java.lang.System.out;
class P54 {
    int d;

    void zero() {
        d = 0;
    }

    public static void main(String[] args) {
        P54 p = new P54();
        out.println(p.d);
        p.d = 123;
        out.println(p.d);
        p.zero();
        out.println(p.d);
        P54 p1 = p;
        p1.d = 123;
        out.println(p.d);
    }
}
