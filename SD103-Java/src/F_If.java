import jdk.jshell.execution.Util;

import java.util.Calendar;
import java.util.Date;

public class F_If {
    public static void main(String[] args) {
        //  programming like life and love does not always take a straight path
        //  so how do we navigate life's highway?
        //  or the highway of Java?
        //  we ask questions and change our direction if needed
        //  for instance what should we do during the day??
        Calendar date = Calendar.getInstance();
        int hour = date.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour = " + hour);
        if (hour < 7) {
            System.out.println("Let me sleep");
        } else if (hour < 13) {
            System.out.println("I'm in class");
        } else if (hour > 22) {
            System.out.println("I'm in bed");
        }

        //  You have several choices when it comes to comparing things
        //  if ( a == 100 )     == are the values the same?
        //  if ( a != 100 )     != are the values the different?
        //  if ( a > 100 )      >  is the value on the left greater than the value on the right?
        //  if ( a >= 100 )     >= is the value on the left greater than or EQUAL TO the value on the right?
        //  if ( a > 100 )      <  is the value on the left less than the value on the right?
        //  if ( a > 100 )      <= is the value on the left less than or EQUAL TO the value on the right?
        //  if the answer is true then do the block of code right below the if
        //  if the answer is false then jump down to the ELSE block of code and do that

        //  TODO Assignment
        //      create 3 or 4 different int variables, assign them some values between -10 and 10
        //      test them to see which ones are different, equal or < or > - print out a message
        //      change the values several times and just prove to yourself that the code works
        //      you will need an else to print if they are NOT < or > or whatever you choose

        //  TODO Assignment
        //  	create a set of expressions for what you are doing each day of the week
        int dow = date.get(Calendar.DAY_OF_WEEK);
        System.out.println(dow);
        if (dow == 0) {
            System.out.println("its sunday");
        } else if (dow == 1) {
            System.out.println("its monday");
        } else if (dow == 2) {
            System.out.println("its tuesday");
        } else if (dow == 3) {
            System.out.println("its wednesday");
        } else if (dow == 4) {
            System.out.println("its thursday");
        } else if (dow == 5) {
            System.out.println("its friday");
        } else if (dow == 6) {
            System.out.println("its saturday");
        }
        String dayString = "";
        switch (dow) {
            case Calendar.SUNDAY:
                dayString = "Sunday";
                break;
            case Calendar.MONDAY:
                dayString = "Monday";
                break;
            case Calendar.TUESDAY:
                dayString = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayString = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayString = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayString = "Friday";
                break;
            case Calendar.SATURDAY:
                dayString = "Saturday";
                break;
        }
        System.out.println(dayString);

        String option = Utils.getInput("type programming language ");
        String computerLanguage = "";
        switch(option){
            case "java":computerLanguage = "im learning it right NOW!!!" ; break;
            case "c#": computerLanguage = " you already learned that language"  ; break;
            case "javascript":computerLanguage = "you already learned that one too buddy" ;break;
        }
        System.out.println(computerLanguage);

        //  TODO Assignment
        //      create a set of expressions to print the average temp for each month of the year


        //  how do we compare strings? They are not numbers but Aarvark is less than Apple
        //  The String object has several compare methods
        String animal = "Aardvark";
        String fruit = "Apple";
        //  compareTo will return
        //      a negative number if the string is less than the string being compared to
        //      0 if they are equal
        //      a positive number if the string is greater than the compared string
        if (animal.compareTo(fruit) > 0) {
            System.out.println("animal = " + animal + " is greater than " + fruit);
        } else {
            System.out.println("fruit = " + fruit + " is greater than " + animal);
        }

        //  equals will return true or false if the strings match or do not match
        if (animal.equals("aardvark")) {
            System.out.println("the animal " + animal + " is indeed an Aardvark");
        } else {
            System.out.println("the animal " + animal + " is NOT an Aardvark");
        }

        //  equalsIgnoreCase will also compare but ignores the differences between upper and lower case
        if (animal.equalsIgnoreCase("aardvark")) {
            System.out.println("the animal " + animal + " is indeed an Aardvark");
        } else {
            System.out.println("the animal " + animal + " is NOT an Aardvark");
        }
        //  compareToIgnoreCase is also available

    }
}