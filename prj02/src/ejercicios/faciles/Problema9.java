package ejercicios.faciles;

/*
 * Dadas 2 cadenas en minuscula (alfabeto ingles)
 * Encontrar:
 * 1) la longitud de ambas cadenas (suma)
 * 2) deterninar si la cadena 1 es mayor a la cadena 2
 * 3) Capitalizar (convertir en mayorucula) la primera letra de cada cadena
 */
public class Problema9 {
    public static void resolver() {
        var cadena1 = "hola";
        var cadena2 = "mundo";

        var longitud = cadena1.length() + cadena2.length();
        System.out.println(longitud);

        var esMayor = cadena1.compareTo(cadena2) > 0 ? "Si" : "No";
        System.out.println(esMayor);

        var mayuscula = cadena1.toUpperCase().substring(0, 1);
        mayuscula += cadena1.substring(1, cadena1.length());
        System.out.println(mayuscula);
    }
}
