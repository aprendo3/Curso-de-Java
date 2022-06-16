import static java.lang.System.out;
class P31 {
    public static void main(String[] args) {
        int[] n = new int[] { 1, 2, 3, 4, 5 };
        
        out.format("Longitud: %d%n", n.length);
        for (int i = 0; i < n.length; i++) {
            out.format("%d, ", n[i]);
        }
    }
}