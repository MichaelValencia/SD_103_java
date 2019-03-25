public class D_StringsPartB {
    public static void main(String[] args) {
        String nextString = "The quick brown fox jumped over the lazy red dog!";

        //  for these next exercises you will need to discover what TYPE of result is returned from each of these expressions
        //  on the replaceAll I could see that the return TYPE was a string.
        //  so I created a String variable, saved the result of the replaceAll method and printed it our
        String changedString;
        changedString = nextString.replaceAll(" ", "-");
        System.out.println("changedString = " + changedString);

        //  TODO Assignment
        //      then you will need to create a variable, get the result and print it out
        //      create a variable that will hold the charAt byte 13 and print it out
        nextString.charAt(13);

        //  TODO    Create a variable that will hold the result of this expression and print it out
        nextString.endsWith("!");

        //  TODO    Create a variable that will hold the result of this expression and print it out
        nextString.startsWith("the");

        //  TODO    Create a variable that will hold the result of this expression and print it out
        //          indexOf looks for a string inside of another string and returns where it was found or -1 if not found
		//          Use the same variable for the three examples.
        nextString.indexOf('x');
        nextString.indexOf('e');
        nextString.lastIndexOf('e');
    }
}
