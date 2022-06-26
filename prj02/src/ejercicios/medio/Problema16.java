package ejercicios.medio;

/*
 * Invertir el orden de las palabras en una cadena.
 * ej:
 * "el cielo es azul" -> "azul es cielo el"
 *
 * "  hola mundo  " -> "mundo hola"
 *
 * "un buen   ejemplo" -> "ejemplo buen un"
 */
public class Problema16 {
    public static void resolver() {
        var cadena = "el cielo es azul";
        System.out.println(invertirPalabras(cadena));

        cadena = "  hola mundo  ";
        System.out.println(invertirPalabras(cadena));

        cadena = "un buen   ejemplo";
        System.out.println(invertirPalabras(cadena));
    }

    private static String invertirPalabras(String cadena) {
        var palabras = cadena.replaceAll("\\s+", " ").split(" ");
        int j = palabras.length - 1;
        for (int i = 0; i < palabras.length / 2; i++, j--) {
            // var aux = palabras[j].trim();
            // palabras[j] = palabras[i].trim();
            var aux = palabras[j];
            palabras[j] = palabras[i];
            palabras[i] = aux;
        }

        // var resultado = "";
        // for (var palabra : palabras) {
        //     resultado += palabra == "" ? "" : palabra + " ";
        // }

        // return resultado;

        return String.join(" ", palabras);
    }
}
