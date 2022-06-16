import static java.lang.System.out;
class P13 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a + b;
        out.format("%d + %d = %d%n", a, b, c);
        
        c = a - b;
        out.format("%d - %d = %d%n", a, b, c);
        
        c = a * b;
        out.format("%d * %d = %d%n", a, b, c);
        
        c = a / b;
        out.format("%d / %d = %d%n", a, b, c);
        
        c = a % b;
        out.format("%d %% %d = %d%n", a, b, c);
    }
}