public class MyPracticeCode {
    public static void main(String[] args) {
        String[] wowClasses = new String[12];
        wowClasses[0] = "Shaman";
        wowClasses[1] = "Druid";
        wowClasses[2] = "Paladin";
        wowClasses[3] = "Demon Hunter";
        wowClasses[4] = "Hunter";
        wowClasses[5] = "Mage";
        wowClasses[6] = "Warlock";
        wowClasses[7] = "Monk";
        wowClasses[8] = "Priest";
        wowClasses[9] = "Rogue";
        wowClasses[10] = "Warrior";
        wowClasses[11] = "Death Knight";
        for (int i = 0; i < wowClasses.length; i++) {
            System.out.println("the classes you can choose in World Of Warcraft are = " + wowClasses[i]);
        }
        System.out.println("the first class i ever played was " + wowClasses[0]);
        System.out.println("my main class was " + wowClasses[0] + " but i changed to " + wowClasses[1] + "in war lords of dreanor " + " but my new main is a " + wowClasses[2]);
        System.out.println("the last element of an array is " + wowClasses[wowClasses.length - 1]);

        //for each loop for wow classes
        for (String classesForWow : wowClasses) {
            System.out.println("wowClasses[i]= " + classesForWow);
        }

        System.out.println("the intials of the classes ive played are " + wowClasses[0].charAt(0) + wowClasses[1].charAt(0) + wowClasses[2].charAt(0));

        System.out.println("this is gonna be super cool! " + wowClasses[2].charAt(5) + " " + wowClasses[0].charAt(2) + wowClasses[3].charAt(2) + " " + wowClasses[8].charAt(0)
                + wowClasses[9].charAt(0) + wowClasses[7].toUpperCase().charAt(1) + wowClasses[5].toUpperCase().charAt(2) + wowClasses[9].charAt(0) +
                wowClasses[10].toUpperCase().charAt(1) + wowClasses[3].toUpperCase().charAt(2) + wowClasses[3].toUpperCase().charAt(2) + wowClasses[8].toUpperCase().charAt(3) +
                wowClasses[6].toUpperCase().charAt(2));


        int height = Utils.getNumber("give me a number up to 25", 25);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        int firstNum, secondNum, closestNum;
        firstNum = Utils.getNumber("give me the first number please: ", 20);
        secondNum = Utils.getNumber("give me the second number please: ", 20);
        closestNum = closestTo10(firstNum, secondNum);
        System.out.println("the number closestNum to 10 = " + closestNum);
    }

    private static int closestTo10(int firstNum, int secondNum) {
        int num1 = 10 - firstNum;
        int num2 = 10 - secondNum;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if (num1 < num2) {
            return firstNum;
        } else {
            return secondNum;
        }
    }
}