package p77;
import static java.lang.System.out;
class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }
}
public class Main {
    public static void main(String[] args) {
        String s1 = "Aprendo";
        String s2 = "Aprendo";
        String s3 = new String("Aprendo");
        out.printf("s1 == s2 : %b | s1 == s3: %b\n",
                s1 == s2, s1 == s3);
        out.printf("s1.equals(s2) : %b | s1.equals(s3): %b\n",
                s1.equals(s2), s1.equals(s3));
        var p1 = new Persona("Pedro", 20);
        var p2 = new Persona("Pedro", 20);
        out.printf("p1 == p2 : %b | p1.nombre == p2.nombre: %b\n", p1 == p2, p1.nombre == p2.nombre);
        out.printf("p1.equals(p2) : %b\n", p1.equals(p2));
    }
}
