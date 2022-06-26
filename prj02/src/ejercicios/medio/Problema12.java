package ejercicios.medio;
/*
 * Buscar un elemento en una matris ordenada de enteros
 * ej:
 * [[1,3,5,7],[10,11,16,20],[23,30,34,60]], n = 3 -> true
 *
 * [[1,3,5,7],[10,11,16,20],[23,30,34,60]], n = 13 -> false
 */
public class Problema12 {
    public static void resolver() {
        int[][] m =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int n = 3;
        System.out.println(buscar(m, n));

        m =  new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        n = 13;
        System.out.println(buscar(m, n));
    }

    private static boolean buscar(int[][] m, int n) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
