package p60;
import static java.lang.System.out;
class Lista {
    //lista.agregar() | lista.obtener() | lista.remover()
    private int[] array = new int[100];
    private int indice;
    public Lista(int... datos) {
        System.arraycopy(datos, 0, array, 0, datos.length);
        indice = datos.length - 1;
    }
    public int obtener(int indice) {
        return array[indice];
    }
    public void agregar(int dato) {
        if (indice == array.length) {
            int[] aux = array;
            array = new int[array.length * 2];
            System.arraycopy(aux, 0, array, 0, aux.length);
        }
        array[++indice] = dato;
    }
    // 1,2,3,4,5 | remover(2) => 1,3,4,5
    public void remover(int dato) {
        for (int i = 0; i <= indice; i++) {
            if (array[i] == dato) {
                recorrer(i);
                indice--;
            }
        }
    }
    private void recorrer(int i) {
        for (int j = i; j < indice; j++) {
            array[j] = array[j + 1];
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= indice; i++) {
            sb.append(String.format("%d,", array[i]));
        }
        sb.append("]");
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(1, 2, 3, 4, 5);
        out.println(lista);
        lista.agregar(6);
        out.println(lista);
        lista.remover(2);
        out.println(lista);
    }
}