public class E_Arrays {
    public static void main(String[] args) {
        //  sometimes one is not enough
        //  but an integer only holds a single number
//        int     scores = 99, 100, 77;
//       boolean passing = true, true, false;
        //  even string only holds a single string
//        String  names = "Java", "C#", "Node.JS

        //  [] square brackets will declare you variable as an array
        int[] scores = new int[10];
        scores[0] = 99;
        scores[1] = 100;
        scores[2] = 77;
        //  which leaves 7 empty positions in the array

        //  SOMETIMES you know the score before you begin and you can take a short cut
        int[] myScores = {99, 100, 77};
        //  this array is only holds three elements

        String[] courses = new String[10];
        courses[0] = "Java";
        courses[1] = "C#";
        courses[2] = "Node.JS";
        courses[3] = "HTML";
        courses[4] = "MongoDB";
        courses[5] = "Pug";
        courses[6] = "CSS";
        courses[7] = "MySQL";
        courses[8] = "Agile";
        courses[9] = "Career Services";

        //  when you create (new) an array you ask the Java Virtual Machine for a chunk of memory
        //  The memory is ONLY as big as you ask it for. Which means once created it can not be expanded or shrunk
//        courses[99] = "SQL";      //  remove the // at the start of this line of code. What error did you get?
        //  E_Arrays all begin at position 0.
        //  Think about what the new is doing. It is giving you the address of a memory location to save your data
        //      When you store something in the first location how far PAST the start of your array do you need to go
        //      to get to that first location? zero. So address 0 is our first location in the array.
        for (String course : courses) {
            System.out.format("What courses do you teach: %s\n",course);
        }

        //  we will talk about LOOPS more in the next lesson.
        //      What you see below is the extended for loop
        //  But what you just saw is a handy way to loop through the elements of an array
        //  let's display our other two arrays
        for (int score : scores) {
            System.out.format("%d\n", score);
        }
        for (int myScore : myScores) {
            System.out.format("%s\n", myScore);
        }

        //  Back to arrays
        //  E_Arrays have a single property: length
        System.out.println("courses.length = " + courses.length);

        //  sometimes we want the last position in an array
        //  The last position can always be found at the length of the array minus one
        String lastCourse = courses[courses.length - 1];        //  want to learn a clever trick? type lst and hit tab
        System.out.format("%s", lastCourse);

        //  Assignment
        //  You will use new to create all arrays
        //  create an array for your family members
        //      create a variable to hold the last family member name
        //      print the last family member name
        //      print the second to the last family member name
        //
        //  create an array for the ages of your family members
        //      print the last family member age
        //      print the age of all family members (use the extended for loop)
        //  create an array for your grocery list
        //      add 5 items to this grocery list
        //      print your grocery list
        //  create an array large enough to hold a number for every day of the year
        //  create an array large enough to hold the name of each day of the week
        //      assign each entry of the array a different day of the week
        //      print out the days of the week using a for loop
        //  create an array large enough to hold the name of each month of the year
        //      assign each entry of the array a different month of the year
        //      print out the months of the year using a for loop
        //      print the last month of the year
    }
}
