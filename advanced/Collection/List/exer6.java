
import java.util.ArrayList;
import java.util.List;

public class exer6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list2 = List.of("D", "E", "F");

        list1.addAll(list2);
        System.out.println(list1);
    }

}
