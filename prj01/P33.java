import static java.lang.System.out;
class P33 {
    public static void main(String[] args) {
        int[] n = new int[] { 2, 1, 4, 3, 1 };
        int suma = 0;
        
        // sumar un arreglo
        for (int i = 0; i < n.length; i++) {
            out.format(" + %d", n[i]);
            suma += n[i];
        }
        
        out.format(" = %d", suma);
    }
}