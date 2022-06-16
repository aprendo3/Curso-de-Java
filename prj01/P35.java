import static java.lang.System.out;
class P35 {
    public static void main(String[] args) {
        int[] n = new int[] { 1, 2, 3, 4, 5 };
        
        // for en decremento o invertido
        for (int i = n.length - 1; i >= 0; i--) {
            out.format("%d, ", n[i]);
        }
    }
}