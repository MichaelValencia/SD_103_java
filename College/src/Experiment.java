import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Experiment {

    //	this is the only attribute in this class
    //		A List of Students read from a text file.
    private List<Student> students;

    public int getHomeStateCount(String state) {
        int count = 0;
        for (Student student : students) {
            if (student.getHomeState().equalsIgnoreCase(state)) {
                count++;
            }
        }
        return count;
    }

    public int getMajorCount(String major) {
        int count = 0;
        for (Student student : students) {
            if (student.getMajor().equalsIgnoreCase(major)) {
                count++;
            }
        }
        return count;
    }

    public int getYearCount(String year) {
        int count = 0;
        for (Student student : students) {
            if (student.getYearInSchool().equalsIgnoreCase(year)) {
                count++;
            }
        }
        return count;
    }

    public List<Student> getStudentsByYear(String year) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getYearInSchool().equalsIgnoreCase(year)) {
                list.add(student);
            }
        }
        return list;
    }

    public int getAverageScholarship() {
        int total = 0;
        int listSize = students.size();
        for (Student student : students) {
            total += student.getScholarship();
        }
        return total / listSize;
    }

    /**
     * main
     * this is where the fun begins
     * We have already added the code to read a CSV final and created a List of Students from this information
     * Your task will be to create and use methods to answer questions about the information in the Student List
     */
    public static void main(String[] args) {

        //	This code is given to you. There is NO NEED TO CHANGE IT
        Experiment test = new Experiment("College.csv");

        int txCount, wyCount;
        txCount = test.getHomeStateCount("texas");
        wyCount = test.getHomeStateCount("wyoming");
        System.out.println("Texas = " + txCount);
        System.out.println("wyCount = " + wyCount);
        int mathCount;
        mathCount = test.getMajorCount("math");
        System.out.println("mathCount = " + mathCount);
        int yearCnt = test.getYearCount("freshman");
        System.out.println("freshman = " + yearCnt);
        int average = test.getAverageScholarship();
        System.out.println(average);

        List studentByYear = test.getStudentsByYear("freshman");
        System.out.println("studentByYear = " + studentByYear);
        //	This is some sample code to show all students in the Students List and how to iterate through the list
        //	many of your tasks will need to do something similar.
        //		loop through the list, look for some value in each student record and
        // 		either count that value or compare to another value
        //	Nothing TODO here - just some sample code to list the students. You'll use this for loop often
//        for (Student student : test.students) {
//            System.out.println("student = " + student);
//        }
    }

    /**
     * Constructor for AltFinal
     */
    public Experiment(String fileName) {
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