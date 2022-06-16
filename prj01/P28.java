import static java.lang.System.out;
class P28 {
    public static void main(String[] args) {
        // contar del 0 al 7 sin el 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            
            out.format("%d, ", i);
            
            if (i == 7) {
                break;
            }
        }
    }
}