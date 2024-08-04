import java.util.Scanner;

public class grades{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input marks for 5 subjects
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percent = (double) totalMarks / 5;
        
        
        char grade;
        if (percent >= 90) {
            grade = 'A';
        } else if (percent >= 80) {
            grade = 'B';
        } else if (percent >= 70) {
            grade = 'C';
        } else if (percent >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percent+ "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
