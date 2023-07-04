package bounded.metodos;

public class MetodoGenerico {
    public static <T extends Comparable<T>> int contandoMayoresQue(T[] arreglo, T elemento) {
        int contador = 0;
        for (T e : arreglo){
            if (e.compareTo(elemento) > 0){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5};
        System.out.println(contandoMayoresQue(numeros, 3));
    }
}
