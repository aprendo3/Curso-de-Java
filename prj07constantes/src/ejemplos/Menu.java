package ejemplos;

import java.util.Scanner;

public class Menu {
    private static final char OPCION_MOSTRAR = 'M';
    private static final char OPCION_PROCESAR = 'P';
    private static final char OPCION_SALIR = 'S';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option = '\0';

        while (option != OPCION_SALIR) {
            System.out.println("Seleccione una opcion:");
            System.out.println(OPCION_MOSTRAR + ": Mostrar");
            System.out.println(OPCION_PROCESAR + ": Procesar");
            System.out.println(OPCION_SALIR + ": Salir");
            option = scanner.next().toUpperCase().charAt(0);

            switch (option) {
                case OPCION_MOSTRAR:
                    System.out.println("Desplegando informacion...");
                    break;
                case OPCION_PROCESAR:
                    System.out.println("Procesando...");
                    break;
                case OPCION_SALIR:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
