package ejercicios.medio;

/*
 * Dados 2 numeros enteros representados como cadenas,
 * retornar la multiplicacion tambien
 * representda como cadena. ej:
 * num1 = "2", num2 = "3" -> "6"
 * num1 = "123", num2 = "456" -> "56088"
 */
public class Problema11 {
    public static void resolver() {
        System.out.println(multiplicar("2", "3"));
        System.out.println(multiplicar("123", "456"));
    }

    private static String multiplicar(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int mul = n1 * n2;

        return Integer.toString(mul);
    }
}
