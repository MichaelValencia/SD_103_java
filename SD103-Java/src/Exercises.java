public class Exercises {
    public static void main(String[] args) {
        String text = "klm";
        text += "nop";
        text += "qrst";
        text = "hij" + text;
        //text += "uv";
        text += "wxy";
        text = "abcdefg" + text;
        text += "z";
        System.out.println("text = " + text + " my string is " + text.length() + " characters long");

        //uv was missing
        //this is another way to insert what was missing

        // "this was the code i commented out to use another way" = text = text.replace("w","uvw");
        //uv was missing
        // this is another way to add what was missing uv after T
        int missing = text.indexOf("t");
        String aToT = text.substring(0, missing);
        String wToZ = text.substring(missing, 24);
        text = aToT + "uv" + wToZ;
        System.out.println(text);

    }
}