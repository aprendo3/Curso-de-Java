package printerbuffered;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            pw = new PrintWriter("test3.txt");
            pw.println("Aprendo");
            pw.println("Aprendo");
            pw.flush();

            FileReader fr = new FileReader("test3.txt");
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Hola");
    }
}
