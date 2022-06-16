package p57;
import static java.lang.System.out;
class Persona {
    public String nombre;
    public int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void Saludar() {
        out.printf("Hola, mi nombre es : %s\n", nombre);
    }
}
class P {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", 30);
        Persona pedro = new Persona("Pedro", 20);
        
        juan.Saludar();
        pedro.Saludar();
    }
}