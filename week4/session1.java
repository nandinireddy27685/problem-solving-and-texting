import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter number of backlogs: ");
        int backlogs = sc.nextInt();

        // Constraints
        if (attendance >= 75 && marks >= 50 && backlogs == 0) {
            System.out.println("Student is Eligible");
        } else {
            System.out.println("Student is Not Eligible");
        }

        sc.close();
    }
}