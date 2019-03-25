public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int number = 37;
        System.out.println("this is a number " + number);

        char character = 'z';
        System.out.println("this is a character " + character);

        double pi = Math.PI;
        System.out.println(" the famous number PI " + pi);

        String firstName = "Michael";
        String lastName = "Valencia";
        char middleInt = 'R';
        int age = 28;
        String address = "2015 Henry dr, Irving Texas 75061";
        float height = 5.7f;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(middleInt);
        System.out.println(age);
        System.out.println(address);
        System.out.println(height);

        System.out.println("This is my first name: " + firstName + " This is my last name: " + lastName + " This is my middle initial: " + middleInt +
                " My age is: " + age + " I live at: " + address + " Im this tall in feet: " + height);

        int junk = age + (int)height;
        System.out.println(junk);

        int moreJunk = middleInt;
        System.out.println(moreJunk);

        System.out.println(Math.random());

        String favoriteMovie1 = " john wick ";
        String favoriteMovie2 = " john wick 2 ";
        String favoriteMovie3 = " ready player one ";
        String favoriteMovie4 = " The Matrix ";
        String favoriteMovie5 = " The Matrix reloaded ";
        String FavoriteMovie6 = " The Matrix Revolutions ";

        System.out.println("favoriteMovie1 = " + favoriteMovie1);
        System.out.println("favoriteMovie2 = " + favoriteMovie2);
        System.out.println("favoriteMovie3 = " + favoriteMovie3);
        System.out.println("favoriteMovie4 = " + favoriteMovie4);
        System.out.println("favoriteMovie5 = " + favoriteMovie5);
        System.out.println("FavoriteMovie6 = " + FavoriteMovie6);

        String[] favoriteMovies = {"john wick ", "john wick 2 ", "ready player one ", " The Matrix ", " The Matrix Reloaded ", " The Matrix Revolutions "};
        System.out.println("my first favorite movie = " + favoriteMovies[0]);
        System.out.println("my last favorite movie = " + favoriteMovies[5]);
        System.out.println("my favorite movies are = " + favoriteMovies[0] + favoriteMovies[1]+ favoriteMovies[2] + favoriteMovies[3]+ favoriteMovies[4]+ favoriteMovies[5]);
        for (int i = 0; i <favoriteMovies.length ; i++) {
            System.out.println( i +" my favorite movie is " + favoriteMovies[i]);
        }
        // prints out last position in array
        System.out.println("my last favorite movie " + favoriteMovies[favoriteMovies.length-1]);

        String[] phoneNum = {"123456789", "987654321", "6666666666", "800880085","800855304", "696969695"};
        System.out.println(phoneNum[2]);

        for (int j = 0; j < phoneNum.length ; j++) {
            System.out.println(j +" my phone numbers are " + phoneNum[j]);
        }
    }
}
