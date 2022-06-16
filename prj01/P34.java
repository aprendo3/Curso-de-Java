import static java.lang.System.out;
class P34 {
    public static void main(String[] args) {
        int[] n = new int[] { 2, 1, 4, 3, 1 };
        int pares = 0;
        
        // contar los numeros par en un arreglo
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                pares++;
            }
        }
        
        out.format("Total de pares: %d", pares);
    }
}