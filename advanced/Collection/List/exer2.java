
import java.util.ArrayList;
import java.util.List;

public class exer2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 5, 3, 7, 8, 5, 9));
        List<Integer> noDupli = new ArrayList<>();

        for (Integer checking : numbers) {
            if (!noDupli.contains(checking)) {
                noDupli.add(checking);
            }
        }

        System.out.println(noDupli);

        // for (Integer display : numbers) {
        // System.out.println(display);
        // }

    }
}
