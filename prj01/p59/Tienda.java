package p59;
public class Tienda {
    public Celular[] celulares;
    
    public Tienda() {
        celulares = new Celular[3];
        Pantalla p1 = new Pantalla(6.7f, "OLED", "1080x2400");
        Pantalla p2 = new Pantalla(6.5f, "IPS", "720x1600");
        celulares[0] = new Celular(p1, 5000, "PiOS", 8,
            "8 nucleos", "Acne");
        celulares[1] = new Celular(p1, 4000, "PiOS", 6,
            "8 nucleos", "Acne");
        celulares[2] = new Celular(p2, 4000, "PiOS", 8,
            "8 nucleos", "Acne");
    }
}