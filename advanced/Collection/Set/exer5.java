
import java.util.Set;

public class exer5 {
    public static void main(String[] args) {
        Set<Integer> allNumbers = Set.of(1, 2, 3, 4, 5, 6, 7);
        Set<Integer> evenNumbers = Set.of(2, 4, 6);
        Set<Integer> oddNumbers = Set.of(1, 3, 5, 8);

        System.out.println("even number subset : " + allNumbers.containsAll(evenNumbers));
        System.out.println("odd number subset : " + allNumbers.containsAll(oddNumbers));

    }

}
