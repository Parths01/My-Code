import Student.Student;// call packages
import Result.Result;
public class Main {

    public static void main(String[] args) {
        Student s = new Student("Parth", 20, 12345, "Computer Application", 85);
        Result r = new Result();
        r.printResult(s);


        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("PRN: " + s.getPRN());
        System.out.println("Course: " + s.getCourse());
        System.out.println("Marks: "+s.getMarks());
        System.out.println("Grade: "+s.getGrade());
    }
}