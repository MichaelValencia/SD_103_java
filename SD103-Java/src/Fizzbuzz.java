public class Fizzbuzz {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        for (int i = 0; i <= 100; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("FizzBuzz");
            } else if (i % a == 0) {
                System.out.println("Fizz");
            } else if (i % b == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
        for (int i = 0; i <20 ; i++) {
            System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3)==0?"fizz":"")+ ((i%5)==0 ? "buzz":""):i);
        }
    }
    private static void fizzsbuzzs(){
        for (int i = 0; i <=20 ; i++) {
            String test ="";
            test += (i%3)==0? "fizz":"";
            test += (i%5)==0? "buzz":"";
            System.out.println(!test.isEmpty()?test :i);

        }
    }

}
