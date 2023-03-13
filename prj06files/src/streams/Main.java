package streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            String msg = "Aprendo";
            fos.write(msg.getBytes(StandardCharsets.UTF_8));
            fos.flush();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[100];
            int leidos = fis.read(buffer);
            fis.close();
            System.out.println(new String(buffer, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola");
    }
}
