package Student;

public class Student {
    private String name;
    private int age;
    private int PRN;
    private String course;
    private int marks;

    public Student(String name, int age, int PRN, String course, int marks) {
        this.name = name;
        this.age = age;
        this.PRN = PRN;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getPRN() {
        return PRN;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }
}
