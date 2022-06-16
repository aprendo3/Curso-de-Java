package p59;
import static java.lang.System.out;
// Celulares??????
class P {
    public static void main(String[] args) {
        Tienda t = new Tienda();
        for (int i = 0; i < t.celulares.length; i++) {
            t.celulares[i].mostrase();
        }
    }
}