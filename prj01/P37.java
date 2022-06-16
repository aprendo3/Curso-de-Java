import static java.lang.System.out;
class P37 {
    public static void main(String[] args) {
        // Concatenar 2 arreglos
        int[] a1 = new int[] { 0, 2, 4, 6, 8 };
        int[] a2 = new int[] { 1, 3, 5, 7, 9 };
        
        int[] a3 = new int[a1.length + a2.length];
        int j = 0;
        
        for (int i = 0; i < a1.length; i++, j++) {
            a3[j] = a1[i];
        }
        
        for (int i = 0; i < a2.length; i++, j++) {
            a3[j] = a2[i];
        }
        
        for (j = 0; j < a3.length; j++) {
            out.format("%d, ", a3[j]);
        }
    }
}