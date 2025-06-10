package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class latihan1 {
    public static void main(String[] args) {
        String sentence = "saya suka makan nasi dan saya suka minum teh";

        String[] arraySentence = sentence.split(" ");
        Map<String, Integer> frequency = new LinkedHashMap<>();

        for (String word : arraySentence) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequency);

    }

}
