public class Tester {
    public static void main(String[] args) {

        Chair officeChair, kitchenChair, homeChair, schoolChair;

        officeChair = new Chair("red",10,true);
        homeChair = new Chair("red", 10,false);
        schoolChair = new Chair("black",7,false);
        kitchenChair = new Chair("brown",8,false);

        System.out.println("officeChair = " + officeChair);
        System.out.println("homeChair = " + homeChair);
        System.out.println("schoolChair = " + schoolChair);
        System.out.println("kitchenChair = " + kitchenChair);

        Book firstBook, secondBook, thirdBook, fourthBook, fifthBook, sixthBook, seventhBook;

        firstBook = new Book("Harry Potter and the Sorcerrs Stone ", " J.K. Rowling "," fantasy ",223,true);
        secondBook = new Book("Harry Potter and the Chamber of Secrets ", " J.K. Rowling "," fantasy ",251,true);
        thirdBook = new Book ("Harry Potter and Prisoner of Azkaban ", " J.K. Rowling ", " fantasy ",317,true);
        fourthBook = new Book ("Harry Potter and the Goblet of Fire"," J.K. Rowling ","fantasy",636,true);
        fifthBook = new Book ("Harry Potter and the Order of Phoenix"," J.K. Rowling "," fantasy ",766,true);
        sixthBook = new Book("Harry Potter and the Half Blood Prince"," J.K. Rowling "," fantasy ",607,true );
        seventhBook = new Book("Harry Potter and the Deathly Hollows ","J.K. Rowling "," fantasy ",607,true);

        System.out.println("firstBook = " + firstBook);
        System.out.println("secondBook = " + secondBook);
        System.out.println("thirdBook = " + thirdBook);
        System.out.println("fourthBook = " + fourthBook);
        System.out.println("fifthBook = " + fifthBook);
        System.out.println("sixthBook = " + sixthBook);
        System.out.println("seventhBook = " + seventhBook);
    }
}
