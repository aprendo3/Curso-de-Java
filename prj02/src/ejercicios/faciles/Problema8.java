package ejercicios.faciles;

/*
 * Dato un numero entero largo representado por un arreglo de enteros
 * donde cada elemento del areglo reprsenta un digito decimal del numero entero.
 * Desde el mas signiticativo hasta el menos significativo.
 * Incrementar el entero largo y retornar su arreglo de digitos. Ej:
 * [1,2,3] -> [1,2,4]
 * [4,3,2,1] -> [4,3,2,2]
 * [9] -> [1,0]
 */
public class Problema8 {
    public static void resolver() {
        int[] arreglo = {9};
        int[] conIncremento = incrementar(arreglo);
        for (int i = 0; i < conIncremento.length; i++) {
            System.out.printf("%d", conIncremento[i]);
        }
        System.out.println();
    }

    private static int[] incrementar(int[] arreglo) {
        for (int i = arreglo.length - 1; i >= 0 ; i--) {
            if (arreglo[i] == 9) {
                arreglo[i] = 0;
                if(i == 0) {
                    arreglo = agregarDigito(arreglo);
                }
            } else {
                arreglo[i]++;
                break;
            }
        }

        return arreglo;
    }

    private static int[] agregarDigito(int[] arreglo) {
        int[] nuevo = new int[arreglo.length + 1];
        nuevo[0] = 1;
        return nuevo;
    }
}
