package funciones;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = cadena -> cadena.length() == 0;
        System.out.println(p1.test(""));
        System.out.println(p1.test("Aprendo"));
        Predicate<Integer> p2 = num -> num % 2 == 0;
        int a = 4;
        System.out.printf("%d es par?: %b\n", a, p2.test(a));
        a = 11;
        System.out.printf("%d es par?: %b\n", a, p2.test(a));
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Aprendo");
        Supplier s1 = () -> 1;
        System.out.println(s1.get());
        Function<String, Integer> f0 = s -> s.length();
        System.out.println(f0.apply("Aprendo"));
        Function<String, Boolean> f1 = s -> s.length() == 4;
        Function<Integer, Function<String, Boolean>> f2 = dInt -> f1;
        System.out.println(f2.apply(1).apply("Hola"));

        Function<Integer, Function<String, Boolean>> f3 =
                datoInt -> datoStr -> datoStr.length() == datoInt;
        System.out.println(f3.apply(2).apply("Hi"));

        int b = 2;
        //b++; debe ser final
        Function<Integer, Integer> f4 = d -> d * b;
        System.out.println(f4.apply(4));
    }
}
