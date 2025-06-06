
import java.util.HashSet;
import java.util.Set;

public class exer2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Set.of("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Set.of("B", "C", "D"));

        set1.addAll(set2);

        System.out.println(set1);
    }

}
