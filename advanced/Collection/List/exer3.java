import java.util.Collections;
import java.util.List;

public class exer3 {
    public static void main(String[] args) {
        List<Integer> scores = List.of(80, 95, 70, 100, 65);
        int maxFirst = Collections.max(scores);
        // System.out.println(maxFirst);

        System.out.println("max scores " + maxFirst);

        /*
         * for (Integer max : scores) {
         * if (max > maxFirst) {
         * maxFirst = max;
         * }
         * }
         * System.out.println(maxFirst);
         */

    }

}
