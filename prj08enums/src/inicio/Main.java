package inicio;

import java.util.Arrays;

enum Nivel { INICIAL, INTERMEDIO, AVANZADO }

enum Estado {
    ENCENDIDO("ON"), APAGADO("OFF");
    private String valor;

    Estado(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

public class Main {
    public static void main(String[] args) {
        Estado[] estados = Estado.values();
        Arrays.stream(estados).forEach(System.out::println);
        Estado estado = Enum.valueOf(Estado.class, "APAGADO");
        System.out.printf("Estado en %s, con valor: %s %n",
                estado, estado.getValor());
        estado = Estado.valueOf("ENCENDIDO");
        System.out.printf("Estado en %s, con valor: %s %n",
                estado, estado.getValor());

//        Nivel nivel = Nivel.INICIAL;
//        System.out.println(nivel);
//        Nivel nivel2 = Nivel.INTERMEDIO;
//        System.out.println(nivel2);
//        evaluar(nivel);
//        Nivel nivel3 = Nivel.AVANZADO;
//        evaluar(nivel3);
    }

    private static void evaluar(Nivel nivel) {
        if (nivel == Nivel.AVANZADO) {
            System.out.println("Ha llegado al ultimo nivel");
        } else {
            System.out.println("puede subir de nivel");
        }
    }
}
