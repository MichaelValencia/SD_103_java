public class WhatIsWrong {
    public static void main(String[] args) {
        //  print "I am looping i = #" from 1 to 7
        for (int i = 1; i <= 7; i++) {
            System.out.println(i);
        }

        for (int d = -5; d <= 5; d++) {
            System.out.println(d);
        }

        //  print these messages 5 times
//       loop number #
//       here I am
        for (int i = 0; i < 5; i++) {
            System.out.println("loop # " + i);
            System.out.println("here I am");
        }

        //  This while loop should print out the loopCnt until it hits 5
        int LoopCnt = Utils.getNumber("Enter a number less than 10", 10);
        while (LoopCnt > 5) {
            System.out.println("Loopcnt = " + LoopCnt);
            LoopCnt--;
        }

        int studentId = 0;
        System.out.println("studentsId = " + studentId);

        double studentAge;
        studentAge = 24.5;
        System.out.println("studentAge = " + studentAge);

        int year = Utils.getNumber("What year is it? ");
        if (year < 1980) {
            System.out.println("who cares about time before 1980");
        } else if (year < 1990) {
            System.out.println("pff! Who cares about Gen Y");
        } else if (year > 1995) {
            System.out.println("Shout Out to Millennials");
            System.out.println("Millenials Rule!");
        }

        String[] raceHorses = new String[7];
        raceHorses[0] = "Seabiscuit";
        raceHorses[1] = "Man O War";
        raceHorses[2] = "Shut Out";
        raceHorses[3] = "Behave Yourself";
        raceHorses[4] = "Lucky Debonair";
        raceHorses[5] = "Pink Star";
        raceHorses[6] = "Aristides";

        System.out.println("last horse in list " + raceHorses[6]);
        System.out.println("the first horse in list " + raceHorses[0]);

        String[] aNames = {"Austin", "Dallas", "Fort Worth", "Arlington", "Houston", "Lubbock"};
        for (String aName : aNames) {
            System.out.println("aNames[i]= " + aName);
        }

        String[] trains = {"The City of New Orleans", "California Zephyr", "Captial Corridor", "Coast Starlight", "Empire Service"};
        System.out.println(trains);
    }
}
