package cop2805;
import java.util.*;

public class CollectionsArray {

    public static void Output(List l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Character> initials = Arrays.asList('B', 'M', 'W');
        System.out.println("Initial List");
        Output(initials);
        Collections.reverse(initials);
        System.out.println("Reversed List");
        Output(initials);

        List<Character> copy = Arrays.asList(' ', ' ', ' ');
        Collections.copy(copy, initials);
        System.out.println("Copied List");
        Output(copy);
        System.out.println("R Filled List");
        Collections.fill(copy, 'R');
        Output(copy);
    }
}