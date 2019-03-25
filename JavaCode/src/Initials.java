import java.util.stream.Collectors;
import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {
        String first, middle, last, myInitials;
        first = "Michael";
        middle = "Ray";
        last = "Valencia";
        myInitials = "" + first.charAt(0) + middle.charAt(0) + last.charAt(0);
        System.out.println("myIntials = " + myInitials);

        String me = "Michael Ray Valencia";
        String[] test = me.split(" ");
        for (int i = 0; i < test.length; i++) {
            System.out.println(i + " words[" + i + "] = " + test[i].charAt(0));
        }

        String myName = "Michael Ray Valencia";
        String nameInitials;
        String[] names = myName.split(" ");
        nameInitials = Arrays.stream(names).map(n -> n.substring(0,1)).collect(Collectors.joining(""));
        System.out.println(nameInitials.toLowerCase());
    }
}
