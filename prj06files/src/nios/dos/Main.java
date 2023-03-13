package nios.dos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("test3.txt");
        try {
            var lineas = Files.readAllLines(filePath);
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
