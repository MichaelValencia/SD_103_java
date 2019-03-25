public class Quiz5 {
    public static void main(String[] args) {
        String rick = "Of all the gin joints in all the towns in the world, she walks in to mine.";
        System.out.println("the length is = " + rick.length());

        String renault = "I'm shocked, shocked to find that gambling is going on in here!";
        System.out.println(renault.charAt(25));
        System.out.println(renault.replaceFirst("shocked","SHOCKED"));

        String phrase = "Play it, Sam. Play ‘As Time Goes By.’";
        System.out.println(phrase.substring (14, 35));

        String playIt = "Play it, Sam. Play 'As Time Goes By.'";
        String quote = playIt.substring (19, 35);
        System.out.println(quote.length());

        String original = "Java Software";
        int   space  = original.indexOf(' ');
        String soft  = original.substring(space+1,space+5);
        String ware  = original.substring(9);
        System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

        String[] words = "This is a string with how many words".split(" ");
        System.out.println("this is the 4th word in the string " + words[3]);
        System.out.println("The string had how many words? " + words.length);

        String replace = original.replace("a","_");
        System.out.println(replace);
        System.out.println(original.replaceFirst("a","_"));

        String thatsWhatSheSaid = "She said, 'Oh, no you did’t' and I said, 'Oh yes I did'";

        System.out.println(thatsWhatSheSaid);
        System.out.println(thatsWhatSheSaid.replaceFirst("She","Barbara"));
        System.out.println(thatsWhatSheSaid.replace("did", "Did"));
        System.out.println(thatsWhatSheSaid.replaceFirst("Oh ", "Oh, ").replace("did","Did"));
}
}