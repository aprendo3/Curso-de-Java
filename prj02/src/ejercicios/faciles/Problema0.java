package ejercicios.faciles;

/*
 * Determinar si una palabra es palindrome o capicua
 * 
 * "reconocer" -> Si
 * "somos" -> Si
 * "sooz" -> Si
 * "radares" -> No
 * 
 */
public class Problema0 {
    public static void resolver() {
        var palabra = "sooz";
        int i = 0;
        int f = palabra.length() -1;
        String capicua = "Si";
        for (; i < palabra.length() / 2; i++, f--) {
            if (palabra.charAt(i) != palabra.charAt(f)) {
                capicua = "No";
            }
        }
        System.out.println(capicua);
    }
}
