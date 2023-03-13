public class EvaluadorAritmetico {
    private static final int ERROR_DIVISION_POR_CERO = 1;
    private static final int ERROR_OPERACION_NO_SOPORTADA = 2;

    public static int evaluarExpresion(int a, int b, String operacion) {
        int resultado = 0;
        switch (operacion) {
            case "+":
                resultado = a + b;
                break;
            case "/":
                if (b == 0) {
                    return ERROR_DIVISION_POR_CERO;
                } else {
                    resultado = a / b;
                }
                break;
            default:
                return ERROR_OPERACION_NO_SOPORTADA;
        }

        System.out.printf("%d %s %d = %d", a, operacion, b, resultado);

        return 0;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String operacion = "/";
        int error = evaluarExpresion(a, b, operacion);
        if (error == ERROR_DIVISION_POR_CERO) {
            System.out.println("Se produjo una división por cero");
        }
    }
}
