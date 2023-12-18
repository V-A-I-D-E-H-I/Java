import java.util.Scanner;

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
    int sportsScore;

    Result(int rollno, int sem1_marks, int sem2_marks) {
        super(rollno, sem1_marks, sem2_marks);
    }

    // Method to calculate total marks
    public int total() {
        return sem1_marks + sem2_marks + score();
    }

    // Method implementation from Sports interface
    public int score() {
        return sportsScore;
    }
}

// Main class to demonstrate the usage
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sports score
        System.out.print("Enter Sports Score: ");
        int sportsScore = scanner.nextInt();

        // Creating an instance of Result
        Result result = new Result(101, 90, 99);
        result.sportsScore = sportsScore;

        // Displaying total marks
        System.out.println("Total Marks: " + result.total());

        scanner.close();
    }
}
