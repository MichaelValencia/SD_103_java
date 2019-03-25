import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //this is a way to create generic objects for an array list
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Set<String> tree = new TreeSet<>();

        while (true) {
            String str = Utils.getInput("Enter a string: ");
            if (str.length() == 0) break;
            list.add(str);
            set.add(str);
            tree.add(str);
        }

        for (String myString : list) {
            System.out.println("List "+ myString);
        }
        for (String myString : set) {
            System.out.println("Set: " + myString);
        }
        for (String myString : tree) {
            System.out.println("tree: " + myString);
        }
        list.sort(null);
    }
}
