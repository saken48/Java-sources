
import java.util.HashSet;
import java.util.Set;

public class exer4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6, 7));

        set2.addAll(set1);
        System.out.println(set2);
    }
}
