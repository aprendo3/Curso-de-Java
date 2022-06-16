import static java.lang.System.out;
class A {
    int d = 123;

    void zero() {
        d = 0;
    }

    public int D() {
        return d;
    }
}
class P55 {
    public static void main(String[] args) {
        A p = new A();
        out.println(p.d);
        p.zero();
        out.println(p.d);
    }
}
