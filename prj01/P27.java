import static java.lang.System.out;
class P27 {
    public static void main(String[] args) {
        // contar del 0 al 9 sin el 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            
            out.format("%d, ", i);
        }
    }
}