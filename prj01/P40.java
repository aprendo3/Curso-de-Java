import static java.lang.System.out;
class P40 {
    public static void main(String[] args) {
        // ordenar un arreglo
        int[] a = new int[] { 4, 1, 5, 3, 2};
        int d;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    d = a[i];
                    a[i] = a[j];
                    a[j] = d;
                }
            }
        }
        
        for (int j = 0; j < a.length; j++) {
            out.format("%d, ", a[j]);
        }
    }
}