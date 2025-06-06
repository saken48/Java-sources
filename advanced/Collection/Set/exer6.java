
import java.util.HashSet;
import java.util.Set;

public class exer6 {
    public static void main(String[] args) {
        String sentence = "Java is great and Java is fun";
        Set<String> unique = new HashSet<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            unique.add(word);
        }

        System.out.println("kata uniq " + unique);
        System.out.println("jumlah kata uniq " + unique.size());

    }

}
