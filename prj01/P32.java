import static java.lang.System.out;
class P32 {
    public static void main(String[] args) {
        int[] n = new int[5];
        
        // iniciar el arreglo
        for (int i = 0; i < n.length; i++) {
            n[i] = i;
        }
        
        // mostrar el arreglo
        for (int i = 0; i < n.length; i++) {
            out.format("%d, ", n[i]);
        }
    }
}