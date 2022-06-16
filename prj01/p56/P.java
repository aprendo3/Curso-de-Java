package p56;
import static java.lang.System.out;
class Persona {
    public String nombre;
    public int edad;
}
class P {
    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.nombre = "Juan";
        juan.edad = 30;
        
        Persona pedro = new Persona();
        pedro.nombre = "Pedro";
        pedro.edad = 20;
        
        out.printf("Nombre: %s, Edad: %d\n",
                juan.nombre, juan.edad);

        out.printf("Nombre: %s, Edad: %d\n",
                pedro.nombre, pedro.edad);
    }
}