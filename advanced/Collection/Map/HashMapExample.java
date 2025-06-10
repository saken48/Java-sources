package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Deklarasi Map: key = String, value = Integer
        Map<String, Integer> scores = new HashMap<>();
        Map<String, Integer> sc = new HashMap<>();

        // Menambahkan data
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        sc.putAll(scores);
        sc.put("Alice", 12);
        System.out.println(sc);

        // Menampilkan semua data
        System.out.println(scores); // Output: {Alice=90, Bob=85, Charlie=95}

        // Mengakses value berdasarkan key
        System.out.println("Nilai Alice: " + scores.get("Alice")); // Output: 90

        // Update nilai
        scores.put("Alice", 92);
        System.out.println("Nilai Alice setelah update: " + scores.get("Alice")); // 92

        // Hapus data
        scores.remove("Bob");
        System.out.println(scores); // {Alice=92, Charlie=95}
    }
}