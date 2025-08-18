package Result;

import Student.Student;

public class Result {

    public void printResult(Student student) {
        // Ensure Student class has getMarks() method
        if (student.getMarks() >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}