package manejables.checkeds;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            checked(4, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    private static void checked(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        int c = a / b;
    }
}
