
import java.util.*;

public class CommonWordsFinder {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "the quick brown fox",
                "quick brown jumps over",
                "brown fox jumps the");

        // Inisialisasi dengan set dari kalimat pertama
        Set<String> commonWords = new HashSet<>(Arrays.asList(sentences.get(0).split(" ")));

        // Loop dari kalimat kedua sampai akhir
        for (int i = 1; i < sentences.size(); i++) {
            Set<String> currentSet = new HashSet<>(Arrays.asList(sentences.get(i).split(" ")));
            commonWords.retainAll(currentSet); // Hanya simpan yang sama
        }

        // Tampilkan hasil
        System.out.println("Kata yang muncul di semua kalimat: " + commonWords);
    }
}
