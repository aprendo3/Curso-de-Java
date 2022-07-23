import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        Stream<Integer> integerStream = Arrays.stream(nums);
        Optional<Integer> op1 = integerStream.max(Integer::compare);
        if (op1.isPresent()) {
            out.println(op1.get());
        } else {
            out.println("nada");
        }

        out.println("\ncount:");
        out.println(Stream.of(1,2,3,4,5).count());

        out.println("\naverage:");
        out.println(IntStream.of(1,2,3,4,5).average().getAsDouble());

        out.println("\nsum:");
        out.println(IntStream.of(1,2,3,4,5).peek(out::println).sum());

        out.println("\nmap:");
        Arrays.stream(new String[] {"1","2","3","4","5"})
                .map(Integer::parseInt)
                .map(n -> n % 2 == 0)
                .forEach(out::println);

        out.println("\ngenerate:");
        Random rnd = new Random();
        Stream.generate(rnd::nextInt)
                .limit(5)
                .forEach(out::println);

        out.println("\nrange:");
        IntStream.range(1, 10)
                .filter(n -> n % 3 == 0)
                .forEach(out::println);

        out.println("\npares:");
        IntPredicate pares = n -> n % 2 == 0;
        IntStream.range(1, 10)
                .filter(pares)
                .forEach(out::println);

        out.println("\nanyMatch:");
        out.println(IntStream.range(1, 10).anyMatch(n -> n >= 10));

        out.println("\nallMatch:");
        out.println(IntStream.range(1, 10)
                .filter(pares)
                .allMatch(pares));

        out.println("\nsorted:");
        IntStream.generate(rnd::nextInt)
                .limit(3)
                .sorted()
                .forEach(out::println);

        out.println("\nfindFirst:");
        IntStream.range(1, 10)
                .findFirst()
                .ifPresent(out::println);

        out.println("\nreduce:");
        out.println(IntStream.rangeClosed(1, 5)
                // 1 * 2 * 3 * 4 * 5 = 5!
                .reduce((a, b) -> a * b)
                .getAsInt());

    }
}
