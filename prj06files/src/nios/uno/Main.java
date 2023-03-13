package nios.uno;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("test3.txt");
        String data = "Aprendo\nAprendo\nAprendo\n";
        try {
            Files.writeString(filePath, data,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);

            System.out.println(Files.readString(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola");
    }
}
