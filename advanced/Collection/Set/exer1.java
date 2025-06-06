
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exer1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1);

        Set<Integer> number = new HashSet<>();

        number.addAll(numbers);

        System.out.println(number);
    }

}
