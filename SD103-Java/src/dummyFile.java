import java.time.DayOfWeek;
import java.util.Scanner;

public class dummyFile {
    public static void main(String[] args) {
        String myString = "SuperNatural";
        char x = 'a';
        //char x = '☺';
        int myFavoriteNumber = 7;
        if (myString.length() < myFavoriteNumber) {
            myFavoriteNumber = myString.length();
            System.out.println("myFavoriteNumber = " + myFavoriteNumber);
        }
        if (myString.indexOf(x) == -1) {
            x = myString.charAt(myString.length() - 1);
            System.out.println("x = " + x);
        } else {
            System.out.println("you found the character in the string");
        }
        String myVariable;
        myVariable = "Day Of the Week";
        char z;
        z = myVariable.charAt(myVariable.length() - 1);
        System.out.println(z);
        char y;
        y = myVariable.charAt(0);
        System.out.println("y = " + y);
        String aString;
        aString = myVariable.substring(0, 3);
        System.out.println("aString = " + aString);
        aString = aString + "---";
        aString = "---" + aString;
        System.out.println("aString = " + aString);
        String name = "michael valencia";
        for (int i = name.length() - 1; i >= 0; i--) {
            name.charAt(i);
            System.out.println(name.charAt(i));
        }

        String str1="may the force be with you", str2;
        for (int i = 0; i <str1.length() ; i++) {
            System.out.println(str1.charAt(i));
        }
        str2 = str1.replaceAll("[aeiouAEIOU]", " ");
        System.out.println("All Vowels Removed Successfully");

        System.out.println(str2);

    }
}