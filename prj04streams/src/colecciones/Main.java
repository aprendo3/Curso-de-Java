package colecciones;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        var l1 = Arrays.asList(1,2,3,4,5);
        l1.stream().filter(n -> n > 2).forEach(out::println);

        BiPredicate<List<Integer>, Integer> contiene = List::contains;
        out.println(contiene.test(l1, 4));

        var l2 = Arrays.asList("Hola","Mundo","Aprendo","hola","mundo");

        out.println("\ndistinct:");
        l2.stream()
                .map(String::toLowerCase)
                .distinct()
                .forEach(out::println);

        out.println("\nfilter:");
        l2.stream()
                .filter(s -> s.length() > 4)
                .forEach(out::println);

        out.println("\nsorted:");
        l2.stream()
                .filter(s -> s.length() > 4)
                .sorted()
                .forEach(out::println);

        out.println("\nsummarizingInt:");
        out.println(l2.stream()
                .collect(Collectors.summarizingInt(String::length)));

        List<Persona> l3 = Persona.personas();

        out.println("\nPersona `sorted` por edad:");
        //l3.stream().sorted((p1, p2) -> p1.edad - p2.edad).forEach(out::println);
        l3.stream().sorted(Comparator.comparingInt(p -> p.edad)).forEach(out::println);

        out.println("\nPersona `filter` por edad:");
        l3.stream()
                .filter(p -> p.edad > 20)
                .forEach(out::println);

        out.println("\nPersona `average` por edad:");
        out.println(l3.stream()
                .mapToInt(p -> p.edad)
                .average()
                .getAsDouble());

        out.println("\nPersona `averagingInt` por edad:");
        out.println(l3.stream()
                .collect(Collectors.averagingInt(p -> p.edad)));

        out.println("\nPersona `filter` por nombre:");
        l3.stream()
                .filter(p -> p.nombre.startsWith("J"))
                .forEach(out::println);

        out.println("\nPersona `max` por longitud de nombre:");
        Comparator<Persona> porLongitudNombre =
                Comparator.comparing(p -> p.nombre.length());
        l3.stream()
                .max(porLongitudNombre)
                .ifPresent(out::println);

        out.println("\nPersona listar nombres:");
        //l3.stream().collect(Collectors.mapping(p -> p.nombre, Collectors.toList())).forEach(out::println);
        l3.stream()
                .map(p -> p.nombre)
                .toList()
                .forEach(out::println);

        out.println("\nPersona `groupingBy` edad:");
        l3.stream()
                .collect(Collectors.groupingBy(p -> p.edad))
                .entrySet()
                .forEach(out::println);
    }
}
