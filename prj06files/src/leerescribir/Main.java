package leerescribir;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("test1.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            fw.write("Aprendo");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            char[] buffer = new char[100];
            int leidos = fr.read(buffer);
            fr.close();

            System.out.println(leidos);
            System.out.println(String.copyValueOf(buffer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola");
    }
}
