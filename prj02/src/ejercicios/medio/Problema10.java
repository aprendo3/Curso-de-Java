package ejercicios.medio;

import java.util.Arrays;

/*
 * dado un numero entero retornar 3 numeros consecutivos que sumados
 * den como resultado el numero de entrada.
 * ej:
 * 33 -> [10,11,12]
 *
 * 4 -> []
 */
public class Problema10 {
    public static void resolver() {
        int numero = 33;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 4;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 5;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 6;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 7;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 8;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 9;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 10;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 11;
        System.out.println(Arrays.toString(numeros(numero)));
        numero = 12;
        System.out.println(Arrays.toString(numeros(numero)));
    }

    private static int[] numeros(int numero) {
        int base = numero / 3 - 1;
        if (base * 3 + 3 == numero) {
            return new int[] {base, base + 1, base + 2};
        }
        return new int[0];
    }
}
