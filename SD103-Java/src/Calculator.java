public class Calculator {
    public static void main(String[] args) {
        double ans = 0, num1 = 0, num2 = 0;

        while (true) {
            String operator = Utils.getInput("what math operator do you wish to play with?");
            if(operator.equalsIgnoreCase("die"))
                break;
            if(operator.equalsIgnoreCase("skip"))
                continue;

            //this is what falling through a switch statement
            switch (operator) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    num1 = Utils.getDouble("give me num1 to use ");
                case "sq":
                case "sqrt":
                case "cos":
                case "tan":
                case "log":
                    num2 = Utils.getDouble("give me a num2 to use");
                    break;
       }
            switch (operator) {
                case "+":
                    ans = num1 + num2;
                    break;
                case "-":
                    ans = num1 - num2;
                    break;
                case "/":
                    ans = num1 / num2;
                    break;
                case "*":
                    ans = num1 * num2;
                    break;
                case "^":
                    ans = Math.pow(num1, num2);
                    break;
                case "sq":
                    ans = Math.pow(num2, 2);
                    break;
                case "sqrt":
                    ans = Math.sqrt(num2);
                    break;
                case "cos":
                    ans = Math.cos(num2);
                    break;
                case "tan":
                    ans = Math.tan(num2);
                    break;
                case "pi":
                    ans = Math.PI;
                    break;
                case "log":
                    ans = Math.log(num2);
                    break;
                case "?":
                    System.out.println("please pick one of the following +,-,/,*,^,sq,sqrt,cos,tan,pi,log");
                    break;
            }
            System.out.println(ans);
        }
    }
}