public class A_Types {
    public static void main(String[] args) {

    //  What type of information does your variable hold?
    //  Is it a number
    //      Yes
    //          is is a whole number
    //              Yes it is a whole number
    //                  What is the biggest or smallest value you might need?
    //                  -128 to 127                         then use a byte
                        byte    numOfChildrenInFamily;          //  69 is the record
                                                                //  https://en.wikipedia.org/wiki/List_of_people_with_the_most_children
                        byte    howMuchAWoodChuckCanChuck;      //  about 711 pounds
                                                                //  https://en.wikipedia.org/wiki/How_much_wood_would_a_woodchuck_chuck

    //                  -32K to +32K                        then use a short
                        short   underGradsAtUTA;                //  29,606 undergrads
                        short   sqFeetInAHome;                  //  2,500 sq ft

    //                  -2,000,000,000 to +2 Billion        then use a int
                        int     priceOfAnF35;                   //  around 120 million USD
                        int     priceOfAnNBATeam;               //  a Billion will get you a good team
                        int     distanceFromSun = 92_955_828;   //  miles
                        int     saturn;

    //                  -9,000,000,000,000,000,000 to +9 Quintillion        then use a long
                        long    molleculesInADropOfWatter;      //  1_700+ 15 more zeroes

    //      No it is a decimal number

    //          Do you need more than 7 decimal accuracy?
    //              Yes then you need a double          use these by default. Why not. Java likes doubles better than floats
                        double  pi = Math.PI;
                        double  circumferenceOfEarthOrbit = 2 * pi * distanceFromSun;
    //              No then a float is just fine
                        float   bodyTemp = 98.6f;       //  don't forget to mark any numbers with F to signify float
                        float   averageScore;

    //      No it is NOT a number
    //      Is it true or false?
    //          Yes use a boolean
                    boolean     isPowerOn;
                    boolean     isPatientTerminal;
                    boolean     hasMeaseles;

    //      Then you have only one other choice for a Java primitive
                    char        theLetterA = 'A';                   //  65
                    char        theLettera = 'a';                   //  97
                    char        firstASCII_Character = ' ';         //  character 32
                    char        lastASCII_Character = '~';          //  character 126

    //      but you want more!
    //      String is NOT a primitive. Primitives only hold a single value and do not have methods that work on them
    //      String has length and it has many methods
                    String      quote = "Friends, Romans, Countrymen! Lend me your ears";
                    String      introduction = "My next guest needs no introduction";
    }
}