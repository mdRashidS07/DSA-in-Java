
    import java.util.Scanner;

    public class Grade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // input marks
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();

            // grade calculation
            if (marks >= 90 && marks <= 100) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else if (marks >= 50) {
                System.out.println("Grade: E");
            } else if (marks >= 0) {
                System.out.println("Grade: Fail");
            } else {
                System.out.println("Invalid Marks!");
            }

            sc.close();
        }
    }

