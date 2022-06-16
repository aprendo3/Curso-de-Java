import static java.lang.System.out;
public class P51 {
    public static void main(String[] args) {
        if (args.length < 3) {
            return;
        }
        //1 + 2
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String op = args[1];
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
