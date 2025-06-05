
import java.util.ArrayList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("ArrayList: " + names);
        System.out.println("Index 1: " + names.get(1));
    }
}
