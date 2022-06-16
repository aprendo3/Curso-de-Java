package ejercicios.faciles;

/*
 * Dada una cadena que contine palabras y espacios, encontrar la longitud de la ultima palabra en la cadena, ej:
"Hola Mundo" -> 5
"Esta es una cadena" -> 6
"Aprendo y Me Suscribo" -> 8
 */
public class Problema7 {
    public static void resolver() {
        String cadena = "Hola Mundo";
        int longitud = encontrarLongitud(cadena);
        System.out.println(longitud);
        
        cadena = "Aprendo y Me Suscribo";
        longitud = encontrarLongitud(cadena);
        System.out.println(longitud);

        cadena = "Esta es una cadena";
        longitud = encontrarLongitud(cadena);
        System.out.println(longitud);
    }

    private static int encontrarLongitud(String cadena) {
        var palabras = cadena.split(" ");

        return palabras[palabras.length - 1].length();
    }
}
