package ejercicios.faciles;

/*
 * Dado un numero entero N Obtener los primeros 10 Multiplos, ej:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */
public class Problema4 {
    public static void resolver() {
        int n = 9;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",n, i, n * i );
        }
        
    }
}
