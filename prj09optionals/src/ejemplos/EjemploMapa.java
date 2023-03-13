package ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EjemploMapa {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");

        String key = "c";
        Optional<String> optionalValue = Optional.ofNullable(map.get(key));

        if (optionalValue.isPresent()) {
            System.out.printf("El valor de %s es %s %n", key,  optionalValue.get());
        } else {
            System.out.printf("No se encontró un valor para la clave %s %n", key);
        }
    }
}
