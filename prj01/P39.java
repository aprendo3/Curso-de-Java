import static java.lang.System.out;
class P39 {
    public static void main(String[] args) {
        // invertir un arreglo
        int[] a = new int[] { 1, 2, 3, 4, 5};
        int d;
        int j = a.length - 1;

        for (int i = 0; i < a.length / 2; i++, j--) {
            d = a[i];
            a[i] = a[j];
            a[j] = d;
        }
        
        for (j = 0; j < a.length; j++) {
            out.format("%d, ", a[j]);
        }
    }
}