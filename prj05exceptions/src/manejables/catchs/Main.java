package manejables.catchs;

public class Main {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            System.out.println("Hola");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        } finally {
            System.out.println("Aprendo");
        }
        System.out.println("Mundo");
    }
}
