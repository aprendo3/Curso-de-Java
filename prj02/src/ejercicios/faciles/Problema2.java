package ejercicios.faciles;

/*
 * Dado un numero que representa una cantidad de horas convertir a segundos
 */
public class Problema2 {
    public static void resolver() {
        int horas = 1;
        System.out.println(convertir(horas));
        System.out.println(convertir(2));
        System.out.println(convertir(3));

    }
    public static int convertir(int horas) {
        int segundosEnUnaHora = 3600;
        int segundos = horas * segundosEnUnaHora;
        return segundos;
    }
}
