//import java.util.Scanner;
import static java.lang.System.out;

public class P52 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        java.util.Scanner in = new java.util.Scanner(System.in);
        //1 + 2
        out.println("Ingresea el primer numero");
        int a = in.nextInt();
        out.println("Ingresea el segundo numero");
        int b = in.nextInt();
        out.println("Ingresea la operacion (+, -, x, /)");
        //String op = System.console().readLine();
        in.nextLine();
        String op = in.nextLine();
        int r = 0;

        switch(op) {
            case "+":
                r = sum(a, b);
                break;
            case "-":
                r = sub(a, b);
                break;
            case "x":
                r = mul(a, b);
                break;
            case "/":
                r = div(a, b);
                break;
        }

        out.printf("%d %s %d = %d", a, op, b, r);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}
