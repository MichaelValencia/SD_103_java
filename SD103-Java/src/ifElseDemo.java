class IfElseDemo {
    public static void main (String[] args) {
        int testScore = (args.length == 1) ? Integer.parseInt(args[0]) : 33;
        testScore = Utils.getNumber("what was your score? ",100);
        char grade;
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println ("Grade = " + grade);

        // create two variables
        int num1, num2;
        //ask the user for two numbers
        num1 = Utils.getNumber("give me a number? ");
        num2 = Utils.getNumber("give me another number? ");
        //if the first number is less than 100 multiply the two numbers and print the result
        if(num1 < 100 ){
            System.out.println(num1*num2);
        }
        // if the first number is less than 200 add them together
        else if (num1 < 200) {
            System.out.println(num1 + num2);
        }
        //if the first number is less that 300 subtract them
        else if(num1 < 300){
            System.out.println(num1-num2);
        }
        String test = Utils.getInput("enter a word");
        System.out.println(test);
    }
}