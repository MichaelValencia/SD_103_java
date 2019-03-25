public class C_StringsPartA {
	public static void main(String[] args) {
		//  The String object in Java is VERY handy for holding text
		//  It can hold up to 2_147_483_647 characters
		//  The King James Bible is around 6M
		//  The English Koran is about 1.3M
		//  Let's start smaller
		String hello = "Hello!";
		System.out.println("hello = " + hello);
		//  How long is our string?
		System.out.println("hello.length() = " + hello.length());

		//  We can add strings together
		String greeting = hello + " Edge Tech Academy student";
		System.out.println("greeting = " + greeting);

		//  We can add to the end of a string
		hello = hello + " fellow student";
		System.out.println("hello = " + hello);

		//  We can add to the start of the string
		hello = "I say there! " + hello;
		System.out.println("hello = " + hello);

		//  Each of the above examples actualy create a completely new string.
		//  the old string is discarded.
		//  So if I want to UPPER CASE a string this is how we do it
		hello = hello.toUpperCase();
		System.out.println("hello = " + hello);

		//  now you are yelling lets to lower case now
		hello = hello.toLowerCase();
		System.out.println("hello = " + hello);

		//  sometimes we want to copy parts of a string
		String getMiddle = hello.substring(12, 20);
		System.out.println("getMiddle = " + getMiddle);

		//  C_StringsPartA are objects. Which means that they have defined actions we can perform on a string
		//  like you saw above we can upper and lower case a string of grab a section of the string
		//  to see what else you can do type your string variable name and then type a period.
		//  the period is request to do a string function. The editor will list those functions when we type the period
		boolean found = hello.contains("fellow");
		System.out.println("Did I find fellow? " + found);
		found = hello.contains("FELLOW");
		System.out.println("Did I find FELLOW? " + found);
		found = hello.contains("low");
		System.out.println("Did I find low? " + found);

		//  TODO Assignment
		//      Create a string with your name

		//      Does your name *contain* the letter 'e' (true/false) (2 loc)
		//			save the result to a new variable and print out a good message

		//		what is the position of the letter 'e') (2 loc)
		//			save the postion to a new variable and print it out

		//      upper case your name and print (change your name variable) (2 loc)

		//      add "Esquire" to the end of your name and print. (change your name variable) (2 loc)

		//      add "Sir" or "Dame" as appropriate to the start of your name and print (change your name variable) (2 loc)
		//
	}
}
