
import java.util.ArrayList;
import java.util.List;

public class exer4 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));

        colors.set(2, "Purple");

        System.out.println(colors.toString());

    }

}
