package bounded;

public class NumeroNatural<T extends Number> {
    private T n;
    public NumeroNatural(T n)  {
        this.n = n;
    }
    public boolean esPar() {
        return n.intValue() % 2 == 0;
    }
    public static void main(String[] args) {
        NumeroNatural<Integer> numero = new NumeroNatural<>(2);
        System.out.printf("Es Par ?: %s", numero.esPar());
        //NumeroNatural<String> numero2 = new NumeroNatural<>("2");
    }
}
