// import java.util.Scanner;

// Interface
interface Sports {
    int score();
}

// Student class
class Student {
    int rollno;

    Student(int rollno) {
        this.rollno = rollno;
    }
}

// Test class inheriting from Student
class Test extends Student {
    int sem1_marks;
    int sem2_marks;

    Test(int rollno, int sem1_marks, int sem2_marks) {
        super(rollno);
        this.sem1_marks = sem1_marks;
        this.sem2_marks = sem2_marks;
    }
}

// Result class with multiple inheritance from Test and Sports
class Result extends Test implements Sports {
    Result(int rollno, int sem1_marks, int sem2_marks) {
        super(rollno, sem1_marks, sem2_marks);
    }

    // Method to calculate total marks
    public int total() {
        return sem1_marks + sem2_marks + score();
    }

    // Method implementation from Sports interface
    public int score() {
        // Implement the logic to calculate sports score here
        // For example:
        return 50; // Dummy value for illustration
    }
}

// Main class to demonstrate the usage
public class Main1 {
    public static void main(String[] args) {
        // Creating an instance of Result
        Result result = new Result(101, 80, 85);

        // Displaying total marks
        System.out.println("Total Marks: " + result.total());
    }
}
