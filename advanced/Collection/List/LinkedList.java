import java.util.LinkedList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("LinkedList: " + names);
        
        // Tambahkan di awal
        names.add(0, "Zack");
        System.out.println("After add at index 0: " + names);
    }
}
