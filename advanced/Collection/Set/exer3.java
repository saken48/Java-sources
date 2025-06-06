
import java.util.HashSet;
import java.util.Set;

public class exer3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6, 7));
        Set<Integer> set3 = new HashSet<>();

        // System.out.println(set1.retainAll(set2));

        for (Integer check : set2) {
            if (!set1.contains(check)) {
                set3.add(check);
            }
        }

        for (Integer check : set1) {
            if (!set2.contains(check)) {
                set3.add(check);
            }
        }

        System.out.println(set3);

    }

}
