package p76;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.lang.System.out;
class Persona {// implements Comparable<Persona> {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString() {
        return "{nombre=" + nombre + ", edad=" + edad + '}';
    }
    public int compareTo(Persona p) {
        return edad - p.edad;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Beto", 30));
        lista.add(new Persona("Pedro", 20));
        lista.add(new Persona("Juan", 25));
        out.println(lista);
        // Collections.sort(lista);
        // out.println(lista);
        var porNombre = new Comparator<Persona>() {
            public int compare(Persona p1, Persona p2) {
                return p1.nombre.compareTo(p2.nombre);
            }
        };
        Collections.sort(lista, porNombre);
        out.println(lista);
    }
}
