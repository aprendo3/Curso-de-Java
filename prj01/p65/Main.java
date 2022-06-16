package p65;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        lista.add(6);
        out.println(lista);
        //lista.remove(2);
        lista.remove(Integer.valueOf(2));
        out.println(lista);
        
        Map<String, String> map = new HashMap<>();
        map.put("1", "uno");
        map.put("2", "dos");
        map.put("3", "tres");
        out.println(map.keySet());
        out.println(map.values());
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " | valor: " + map.get(i));
        }
    }
}