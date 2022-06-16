import static java.lang.System.out;
class P30 {
    public static void main(String[] args) {
        // Factorial
        int n = 7;
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i; // 1 * 2 * 3 * 4 * 5
        }
        out.format("Factorial de %d: %d", n, f);
    }
}