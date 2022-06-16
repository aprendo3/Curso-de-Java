package ejercicios.faciles;

/*
 * Remover los elementos duplicados de un arreglo de numeros enteros ordenados ascendentemente, y la longitud resultante
 * [1,1,2] -> [1,2,_]; k=2
 * [0,0,1,1,1,2,2,3,3,4] -> [0,1,2,3,4,_,_,_]; k=5

 */
public class Problema5 {
    public static void resolver() {
        int[] arreglo = {1, 1, 2};
        int k = removerDuplicados(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d,", arreglo[i]);
        }
        System.out.printf("\n%d\n", k);

        arreglo = new int[]{0,0,1,1,1,2,2,3,3,4};
        k = removerDuplicados(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d,", arreglo[i]);
        }
        System.out.printf("\n%d\n", k);
    }

    private static int removerDuplicados(int[] arreglo) {
        int k = arreglo.length;
        for (int i = 0; i < arreglo.length - 1; i++) {
            while (arreglo[i] == arreglo[i + 1] && arreglo[i] != -1) {
                moverElementos(arreglo, i + 1);
                k--;
            }
        }

        return k;
    }

    private static void moverElementos(int[] arreglo, int inicio) {
        for (int i = inicio; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
            arreglo[i + 1] = -1;
        }
    }
}
