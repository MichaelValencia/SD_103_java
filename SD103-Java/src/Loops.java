public class Loops {
    public static void main(String[] args) {
        String[] courses = {"java","c sharp","javascript","html","databases"};
        for (int i = 0; i <courses.length ; i++) {
            System.out.println(courses[i]);
        }

        int stop =-1;
        while(stop >=0){// the while loop is a pretest loop
            stop = Utils.getNumber(" while - enter -1 to stop");
        }

        do{// the do-while loop is a post test loop
            stop = Utils.getNumber("Do While - enter -1 to stop");
        }while(stop>=0);
    }
}
