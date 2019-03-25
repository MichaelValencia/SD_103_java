public class NumbersToWords {
	public static void main(String[] args) {
		/*
			this loop goes from 0 to 100
			and we will print out the words of our number
			yes we are rock stars
		 */
		for (int i = 0; i < 100; i++) {
			String word = convertToWords4(i);
			System.out.println("The number " + i + " = " + word);
		}
	}

	public static String convertToWords(int num) {
		String word = "";
		int tens = num / 10;
		int ones = num % 10;

		switch (tens) {
			case 2: 	word = "twenty  ";		break;
			case 3:		word = "thirty  ";		break;
			case 4:		word = "forty   ";		break;
			case 5:		word = "fifty   ";		break;
			case 6:		word = "sixty   ";		break;
			case 7:		word = "seventy ";		break;
			case 8:		word = "eighty  ";		break;
			case 9:		word = "ninety  ";		break;
		}

		//	we have nice function to return the ones
		word += getOnes(ones);

		switch (num) {
			case 0:		word = "zero";		break;
			case 10:	word = "ten";		break;
			case 11:	word = "eleven";	break;
			case 12:	word = "twelve";	break;
			case 13:	word = "thirteen";	break;
			case 14:	word = "fourteen";	break;
			case 15:	word = "fifteen";	break;
			case 16:	word = "sixteen";	break;
			case 17:	word = "seventeen";	break;
			case 18:	word = "eighteen";	break;
			case 19:	word = "nineteen";	break;
		}
		return word;
	}

	public static String getOnes (int ones) {
		String word = "";
		switch (ones) {
			case 1 : word = "one";		break;
			case 2 : word = "two";		break;
			case 3 : word = "three";	break;
			case 4 : word = "four";		break;
			case 5 : word = "five";		break;
			case 6 : word = "six";		break;
			case 7 : word = "seven";	break;
			case 8 : word = "eight";	break;
			case 9 : word = "nine";		break;
		}
		return word;
	}

	static String[] tensArray   = { "",     "XXXX",   "twenty  ", "thirty  ",  "forty   ", "fifty   ", "sixty   ", "seventy ",  "eighty  ", "ninety  "  };
	static String[] onesArray   = { "",     "one",    "two",      "three",     "four",     "five",     "six",      "seven",     "eight",    "nine"      };
	static String[] onesAndTeens = {"zero", "one",    "two",      "three",     "four",     "five",     "six",      "seven",     "eight",    "nine",
									"ten",  "eleven", "twelve",   "thirteen",  "fourteen", "fifteen",  "sixteen",  "seventeen", "eighteen", "nineteen"  };
	static String[] teensArray  = { "ten",  "eleven", "twelve",   "thirteen",  "fourteen", "fifteen",  "sixteen",  "seventeen", "eighteen", "nineteen"  };

	public static String convertToWords2(int num) {
		String word;

		if (num == 0) {
			word = "zero";
		} else if (num >= 10 && num <= 19) {
			word = teensArray[num - 10];
		} else {
			word = tensArray[num / 10] + onesArray[num % 10];
		}
		return word;
	}

	public static String convertToWords3(int num) {
		return (num == 0) ? "zero" : (num >= 10 && num <= 19) ? teensArray[num - 10] : tensArray[num / 10] + onesArray[num % 10];
	}

	public static String convertToWords4(int num) {
		return (num<20) ? onesAndTeens[num] : tensArray[num / 10] + ((num % 10 != 0) ? onesAndTeens[num % 10] : "");
	}
}
