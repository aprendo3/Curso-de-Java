package objetos;

import java.io.*;
import java.util.ArrayList;

class Persona implements Serializable {
    private int edad;
    private String nombre;
    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
public class Main {
    public static void main(String[] args) {
        //unObjeto();
        variosObjetos();
        System.out.println("Aprendo");
    }
    public static void unObjeto() {
        var pedro = new Persona("Pedro", 20);
        try {
            var fs = new FileOutputStream("persona.data");
            var os = new ObjectOutputStream(fs);
            os.writeObject(pedro);
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            var fis = new FileInputStream("persona.data");
            var ois = new ObjectInputStream(fis);
            var persona = (Persona)ois.readObject();
            System.out.println(persona.getNombre());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void variosObjetos() {
        var fileName = "personas";
        try (var os = new ObjectOutputStream(new FileOutputStream(fileName))){
            var personas = new ArrayList<Persona>();
            personas.add(new Persona("Pedro", 20));
            personas.add(new Persona("Andres", 30));
            os.writeObject(personas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (var ois = new ObjectInputStream(new FileInputStream(fileName))){
            var personas = (ArrayList<Persona>)ois.readObject();
            for (Persona persona : personas) {
                System.out.println(persona.getNombre());
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
