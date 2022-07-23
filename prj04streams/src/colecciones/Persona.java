package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString() {
        return "{nombre=" + nombre + ", edad=" + edad + '}';
    }

    public static List<Persona> personas() {
        List<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Beto", 30));
        lista.add(new Persona("Pedro", 20));
        lista.add(new Persona("Juan", 25));
        lista.add(new Persona("Ana", 30));
        lista.add(new Persona("Maria", 20));
        lista.add(new Persona("Juana", 25));
        lista.add(new Persona("Fernado", 25));

        return lista;
    }
}
