package Map;

import java.util.HashMap;
import java.util.Map;

public class latihan2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1, "B", 2));
        Map<String, Integer> map2 = new HashMap<>(Map.of("B", 3, "C", 4));

        map1.putAll(map2);

        System.out.println(map1);
    }

}
