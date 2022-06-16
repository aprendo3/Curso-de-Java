package ejercicios.faciles;

/*
 * Dado un arreglo de enteros ordenados y distintos, y un numero entero, encontrar el indicie donde este el numero, si se encuentra en el arreglo, o el indice donde puede ser insertado si no se encuentra en el arreglo.
[1,3,5,6];5 -> 2
[1,3,5,6];2 -> 1
[1,3,5,6];7 -> 4

 * 
 */
public class Problema6 {
    public static void resolver() {
        int[] arreglo = {1,3,5,6};
        int numero = 7;
        int k = encontarIndice(arreglo, numero);
        System.out.println(k);
    }

    private static int encontarIndice(int[] arreglo, int num) {
        int indice = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num || arreglo[i] > num) {
                indice = i;
                break;
            } else if (i == arreglo.length -1) {
                indice = i + 1;
            }
        }

        return indice;
    }
}
