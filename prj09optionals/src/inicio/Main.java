package inicio;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        evaluar("Aprendo");
        try {
            evaluar(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void evaluar(String dato) {
//        if (dato != null) {
//            System.out.printf("El dato es: %s %n", dato);
//        }
        var opcional = Optional.ofNullable(dato);

//        if (opcional.isPresent()) {
//            System.out.printf("El dato es: %s %n", opcional.get());
//        }
        //opcional.ifPresent(s -> System.out.printf("El dato es: %s %n", s));
        //var valor = opcional.orElse("sin valor");
        var valor = opcional.orElseThrow(IllegalArgumentException::new);

        System.out.printf("El dato es: %s %n", valor);
    }
}
