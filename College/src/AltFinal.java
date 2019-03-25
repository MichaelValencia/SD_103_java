import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AltFinal {

    //	this is the only attribute in this class
    //		A List of Students read from a text file.
    private List<Student> students;

    /**
     * countHomeState
     *
     * @param homeState - we want to count the students from this state
     * @return we are returning an integer of the number of students counted
     * <p>
     * This code is complete. It has a great pattern to follow in the rest of the methods you need to create
     */
    public int countHomeState(String homeState) {
        int cntHomeState = 0;
        for (Student student : students) {
            if (student.getHomeState().equalsIgnoreCase(homeState)) {
                cntHomeState++;
            }
        }
        return cntHomeState;
    }

    /**
     * highestScholarship
     *
     * @return we are returning a Student record of the student with the highest scholarship amount
     * <p>
     * find the student with the highest scholarship
     */
    public Student highestScholarship() {
        Student bigStudent = students.get(0);        //	this is initialized to null for now until you add your code below
        for (Student student : students)
            if (student.getScholarship() > bigStudent.getScholarship()) {
                bigStudent = student;
            }
        //	TODO 	!!!!!!!!!!! find and return the student with the highest scholarship in the students List
        return bigStudent;
    }

    /**
     * countYearInSchoolAndMinor
     *
     * @return int - count of students matching the yearInSchool parameter
     * String 		minor			- Math, English, Comp Sci
     * String 		yearInSchool	- Freshman, Sophomore,... whatever gets passed in
     */
    //	TODO add a method!!!!!!!!!!! here to count students that match a specified minor AND year in school
    public int getCountYearInSchoolAndMinor(String year, String minor) {
        int count = 0;
        for (Student student : students) {
            if (student.getYearInSchool().equalsIgnoreCase(year) && student.getMinor().equalsIgnoreCase(minor)) {
                count++;
            }
        }
        return count;
    }


    /**
     * scholarshipsGreaterThan
     *
     * @return - what should the return type be???
     * parameters - what will the parameters of the method require???
     */
    //	TODO 	add a method here!!! count students that have a scholarship greater than the parameter scholarship
    public int getScholarshipsGreaterThan(int Scholarship) {
        int count = 0;
        for (Student student : students) {
            if (student.getScholarship() >= Scholarship) {
                count++;
            }
        }
        return count;

    }
    /**
     * highScholarshipStateStudent
     *
     * @param homeState - we are looking for students from this state
     * @return
     */
    //	TODO 	add code to this method!!!!!! find the student with the best scholarship for a given state
    public Student highScholarshipStateStudent(String homeState) {
        Student bestStudent = students.get(0);
        for (Student student : students) {
            if (student.getHomeState().equalsIgnoreCase(homeState)) {
                if (student.getScholarship() > bestStudent.getScholarship()) {
                    bestStudent = student;
                }
            }
        }
        //	we need to initialize to some student to get started
        //	be aware that this student may not be for your desired homeState
        //	TODO 	!!!!!!!!!!! find and return the student with the highest scholarship in the students List
        return bestStudent;
    }

    /**
     * scholarshipTotal
     *
     * @param homeState String - name of student's home state
     * @param major     String - student's current major
     * @return the total amount of scholarships for students with a specified major and homeState
     * <p>
     * This is a great example of searching a list for multiple criteria
     */
    public int scholarshipTotal(String homeState, String major) {
        int total = 0;
        for (Student student : students) {                                            //	look at all students
            if (homeState == null || student.getHomeState().equals(homeState)) {    //	are they from the desired state? or are we ignoring the state (null)
                if (major == null || student.getMajor().equals(major)) {            //	do they have the right major? or are we ignoring the major (null)
                    total += student.getScholarship();                                //	we have a match - add the scholarship to the total
                }
            }
        }
        return total;
    }


    /**
     * Constructor for AltFinal
     */
    public AltFinal(String fileName) {
        //	create the List for the students
        this.students = new ArrayList<>();

        //	call the load method to read the student roster file and add them to our students list
        loadStudents(fileName);
    }

    /**
     * AltFinal class contains a single attribute. It is a List of Students.
     * This method will add students to that List
     */
    public void addStudent(Student student) {
        students.add(student);
    }


    /**
     * main
     * this is where the fun begins
     * We have already added the code to read a CSV final and created a List of Students from this information
     * Your task will be to create and use methods to answer questions about the information in the Student List
     */
    public static void main(String[] args) {

        //	This code is given to you. There is NO NEED TO CHANGE IT
        AltFinal altFinal = new AltFinal("College.csv");

        //	This is some sample code to show all students in the Students List and how to iterate through the list
        //	many of your tasks will need to do something similar.
        //		loop through the list, look for some value in each student record and
        // 		either count that value or compare to another value
        //	Nothing TODO here - just some sample code to list the students. You'll use this for loop often
        for (Student student : altFinal.students) {
            System.out.println("student = " + student);
        }

        //	----------------------------------------------------------------------------------------------
        //	Now that we have all of the data loaded let's do some analysis on the information

        //	Below here is the code to use for the the Final

        //	Commented out until you write the code for the highScholarshipStateStudent method.
        Student bigMoney;
        bigMoney = altFinal.highScholarshipStateStudent("Texas");
        System.out.println(bigMoney.getName() + " is from " + bigMoney.getHomeState() + " and received a $" + bigMoney.getScholarship() + " scholarship!");
        bigMoney = altFinal.highScholarshipStateStudent("California");
        System.out.println(bigMoney.getName() + " is from " + bigMoney.getHomeState() + " and received a $" + bigMoney.getScholarship() + " scholarship!");
        bigMoney = altFinal.highScholarshipStateStudent("Utah");
        System.out.println(bigMoney.getName() + " is from " + bigMoney.getHomeState() + " and received a $" + bigMoney.getScholarship() + " scholarship!");
        bigMoney = altFinal.highScholarshipStateStudent("Washington");
        System.out.println(bigMoney.getName() + " is from " + bigMoney.getHomeState() + " and received a $" + bigMoney.getScholarship() + " scholarship!");
        bigMoney = altFinal.highScholarshipStateStudent("Oregon");
        System.out.println(bigMoney.getName() + " is from " + bigMoney.getHomeState() + " and received a $" + bigMoney.getScholarship() + " scholarship!");
        bigMoney = altFinal.highScholarshipStateStudent("Nevada");
        System.out.println(bigMoney.getName() + " is from " + bigMoney.getHomeState() + " and received a $" + bigMoney.getScholarship() + " scholarship!");
        //	The test is to create methods that will look at the student List and
        // 	count different values or compare them to find what we are interested in

        //	TODO At the top of this file there is a highestScholarship method.
        // 			You have to add code to that method for this to work
        //	when you have created the method you can uncomment these two lines of code to see your results
        Student student = altFinal.highestScholarship();
        System.out.println(student.getName() + " has the biggest Scholarship for: $" + student.getScholarship());

        //	TODO print how many students are from Texas
        int texans = altFinal.countHomeState("Texas");
        System.out.println("Students in Texas: " + texans);
        //	TODO print how many students are from outside the US (Their homeState is Foreign)
        int foreign = altFinal.countHomeState("Foreign");
        System.out.println("Students in Foreign: " + foreign);
        //	TODO print which of these two cities has the most students
        //	You must compare the counts for the two groups of students (Texans and Foreign)
        // 	then print which has the most students. Your code must tell you. You must use an if-else statement
        if (texans > foreign) {
            System.out.println("Texans has the most students" + texans);
        } else System.out.println("Foreign has the most students"+ foreign);


        //	TODO 	how many Freshman students appear in the list?
        //	TODO 	how many Senior students appear in the list?
        //	TODO 	how many Masters students appear in the list?
        //			use the countYearInSchool method to answer the above questions
        int yearInSchoolX = altFinal.getCountYearInSchoolAndMinor("Freshman", "Comp Sci");
        System.out.println("There were " + yearInSchoolX + " Comp Sci Freshman students");

        int yearInSchool = altFinal.getCountYearInSchoolAndMinor("Freshman", "Math");
        System.out.println("There were " + yearInSchool + " Freshman students");

        //	TODO 	how many students have scholarships greater than $XX,000?
        //			you will have to create the scholarshipsGreaterThan method to get your answer
        //			then you can uncomment the lines below to print it out
        int bigScholarships = altFinal.getScholarshipsGreaterThan(5000);
        System.out.println("Scholarships greater than $5000: " + bigScholarships);

//		//	TODO 	print how many students have scholarships greater than $8,000?
        int testScholarshipMethod = altFinal.getScholarshipsGreaterThan(8000);
        System.out.println("there are this many students  " + testScholarshipMethod + " that have scholarships greater than 8000");

        System.out.println("Scholarships for Texans studying anything   $" + altFinal.scholarshipTotal("Texas", null));
        System.out.println("Scholarships for anyone studying Statistics $" + altFinal.scholarshipTotal(null, "Statistics"));
        System.out.println("Scholarships for Texans studying Statistics $" + altFinal.scholarshipTotal("Texas", "Statistics"));
        System.out.println("Scholarships for anyone studying anything   $" + altFinal.scholarshipTotal(null, null));
    }

    /**
     * loadStudents
     *
     * @param fileName use this file to read in the students to be added to our students list
     */
    private void loadStudents(String fileName) {
        //	Read in the College.csv file
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            //	consume the header line
            br.readLine();
            //	Read each line of the file and create a Student object for that line
            while ((line = br.readLine()) != null) {
                String[] aLine = line.split(",");
                //	The student object has the following fields
                //		Entry,Company,Date, Week ,Location,Salary,Position,Title
                Student student = new Student(Integer.parseInt(aLine[0]), aLine[1], aLine[2], aLine[3], Integer.parseInt(aLine[4]), aLine[5], aLine[6]);
                addStudent(student);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // handle exception
        }
    }
}