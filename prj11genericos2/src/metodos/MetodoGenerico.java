package metodos;

public class MetodoGenerico {
    static <T> void test(T dato) {
        System.out.println(dato.toString());
    }

    public static void main(String[] args) {
        MetodoGenerico.<String>test("Aprendo string");
        //MetodoGenerico.<int>test(1);
        MetodoGenerico.<Integer>test(1);
        MetodoGenerico.<MetodoGenerico>test(new MetodoGenerico());
    }
    public String toString() {
        return "Aprendo Metodo Generico";
    }
}
