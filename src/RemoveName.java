import java.util.ArrayList;
import java.util.Arrays;

public class RemoveName {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>
                (Arrays.asList("John", "Mark", "Sam", "Josh"));

        names.removeAll(Arrays.asList("Sam"));

        System.out.println(names);

    }


}
