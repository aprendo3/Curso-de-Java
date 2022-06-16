import static java.lang.System.out;
class P36 {
    public static void main(String[] args) {
        int[] a1 = new int[] { 0, 2, 4, 6, 8 };
        int[] a2 = new int[] { 1, 3, 5, 7, 9 };
        
        for (int i = 0; i < a1.length; i++) {
            out.format("%d, ", a1[i]);
            out.format("%d, ", a2[i]);
        }
    }
}