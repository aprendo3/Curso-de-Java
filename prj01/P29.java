import static java.lang.System.out;
class P29 {
    public static void main(String[] args) {
        // mostrar los digitos de un nuemro
        int n = 123;
        int d = 0;
        out.println(n / 10);
        out.println(n % 10);
        out.format("Digitos de %d: ", n);
        while(n > 0) {
            d = n % 10;
            n = n / 10;
            out.format("%d, ", d);
        }
    }
}