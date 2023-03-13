package nios.tres;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("test3.txt");
        try(Stream<String> lineas = Files.lines(filePath)) {
            lineas.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
