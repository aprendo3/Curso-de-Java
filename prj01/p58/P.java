package p58;
import static java.lang.System.out;
class Persona {
    private String nombre;
    private int edad;
    private String apellido;
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void Saludar() {
        out.printf("Hola, mi nombre es : %s %s\n",
                nombre, apellido);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre =
                nombre.substring(0, 1).toUpperCase()
                + nombre.substring(1);
    }
    
    public int getEdad() {
        return edad;
    }
}
class P {
    public static void main(String[] args) {
        test2(1);
        test2(1, 2, 3, 4, 5);
    }
    public static void test2(int... a) {
        for (int i = 0; i < a.length; i++) {
            out.printf("(test2) a[%d] = %d | ", i, a[i]);
        }
        out.println();
    }
    public static void test(int d) {
        out.printf("(test) d = %d\n", d);
    }
    public static void test(Persona p) {
        out.printf("(test) nombre = %s\n", p.getNombre());
    }
    public static void test(int d, Persona p) {
        d = 1;
        p.setNombre("Pedro");
        out.printf("(test) d = %d | nombre = %s\n", 
            d, p.getNombre());
        p = null;
        out.print("(test) p == null: ");
        out.println(p == null);
    }
}