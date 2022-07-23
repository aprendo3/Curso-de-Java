package usos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var lista = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Aprendo"));
        lista.sort((s1, s2) -> s1.compareTo(s2));
        lista.forEach(s -> System.out.println(s));
        lista.removeIf(s -> s.length() < 5);
        System.out.println("---");
        lista.forEach(s -> System.out.println(s));

    }
}
