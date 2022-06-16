package p59;
public class Pantalla {
    float tam;
    String tipo;
    String resol;
    
    public Pantalla(float tam, String tipo, String resol) {
        this.tam = tam;
        this.tipo = tipo;
        this.resol = resol;
    }
    
    public float getTam() {
        return tam;
    }
}