import static java.lang.System.out;
class P41 {
    public static void main(String[] args) {
        int i = 1;
        String s = "Aprendo";
        int[] a = null;
        a = new int[3];
        int[] a1 = a;
        int[] a2 = a;
        a[0] = 0;
        a1[1] = 1;
        a2[2] = 2;
        for (i = 0; i < a.length; i++) {
            out.println(a[i]);
        }
    }
}