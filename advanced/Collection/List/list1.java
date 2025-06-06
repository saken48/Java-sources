
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>(List.of(1, 2, 3, 2, 4, 5, 1));
        numbers.add(10);
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]
    }

}
