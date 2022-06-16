package p59;
import static java.lang.System.out;
public class Celular {
    Pantalla pantalla;
    int bateria;
    String SO;
    int memoria;
    String CPU;
    String marca;
    
    public Celular(
        Pantalla pantalla,
        int bateria,
        String SO,
        int memoria,
        String CPU,
        String marca) {
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.SO = SO;
        this.memoria = memoria;
        this.CPU = CPU;
        this.marca = marca;
    }
    public void mostrase() {
        out.printf("Marca: %s, Pantalla: %s, Memoria: %s\n",
            marca, pantalla.getTam(), memoria);
    }
}
