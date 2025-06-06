
import java.util.ArrayList;
import java.util.List;

public class excer1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Manggo");

        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());

        // Tambahkan "Mango" di posisi kedua
        // Lalu cetak elemen pertama dan terakhir
    }

}
