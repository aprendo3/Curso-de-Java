package manejables;

public class Main {
    public static void main(String[] args) {
        uncheckeds();
        System.out.println("Aprendo");
    }

    private static void uncheckeds() {
        throw new RuntimeException("Aprendo");
        //int a = Integer.parseInt("a");
    }

    private static void uncheckeds0() {
        nullPointer();
        arithmetic(0);
        indexOutOfBounds(new String[0]);
    }

    private static void arithmetic(int div) {
        try {
            int b = 2 / div;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static void indexOutOfBounds(String[] args) {
        try {
            String s = args[0];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void nullPointer() {
        Main obj = null;
        try {
            noNulos(obj);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static void noNulos(Main obj){
        System.out.println(obj.toString());
    }
}
