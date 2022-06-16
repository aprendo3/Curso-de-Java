package ejercicios.faciles;

/*
 * en un arreglo de enteros, retornar los indices de de 2  elemetos cuya suma sea igual a cierto numero
 * [2,7,11,15] (9) -> [0,1]
 * [3,2,4] (6) -> [1,2]
 */
public class Problema3 {
    public static void resolver() {
        int[] arreglo = {2, 7, 11, 15};
        int suma = 9;
        int[] indicies = obtenerIndicies(arreglo, suma);
        System.out.printf("%d | %d\n", indicies[0], indicies[1]);
        arreglo = new int[]{3, 2, 4};
        suma = 6;
        indicies = obtenerIndicies(arreglo, suma);
        System.out.printf("%d | %d\n", indicies[0], indicies[1]);
    }

    private static int[] obtenerIndicies(int[] arreglo, int suma) {
        int[] indices = new int[2];
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] + arreglo[i + 1] == suma) {
                indices[0] = i;
                indices[1] = i + 1;
                break;
            }
        }
        return indices;
    }
}
