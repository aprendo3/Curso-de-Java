package ejercicios.medio;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Dada una matris de m x n (de enteros), si un elemento
 * es cero, cambiar todos los elentos de su columna y su fila por cero
 * ej:
 * [[1,1,1],[1,0,1],[1,1,1]] -> [[1,0,1],[0,0,0],[1,0,1]]
 *
 * [[0,1,2,0],[3,4,5,2],[1,3,1,5]] -> [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
public class Problema13 {
    public static void resolver() {
        int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
        var zeros = buscarZeros(m);
        cambiarAZeros(m, zeros);
        System.out.println(Arrays.deepToString(m));

        m = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        zeros = buscarZeros(m);
        cambiarAZeros(m, zeros);
        System.out.println(Arrays.deepToString(m));
    }

    private static void cambiarAZeros(int[][] m, ArrayList<ArrayList<Integer>> zeros) {
        for (int fila : zeros.get(0)) {
            for (int i = 0; i < m[fila].length; i++) {
                m[fila][i] = 0;
            }
        }

        for (int col : zeros.get(1)) {
            for (int i = 0; i < m.length; i++) {
                m[i][col] = 0;
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> buscarZeros(int[][] m) {
        var zeros = new ArrayList<ArrayList<Integer>>();
        zeros.add(new ArrayList<>());
        zeros.add(new ArrayList<>());
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    zeros.get(0).add(i);
                    zeros.get(1).add(j);
                }
            }
        }
        return zeros;
    }
}
