import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // Read the number of students
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Initialize counters for grades
        int countD = 0, countC = 0, countB = 0, countA = 0;

        // Read grades and count occurrences
        for (int i = 0; i < n; i++) {
            String grade = scanner.nextLine();

            if (grade.equals("D")) {
                countD++;
            } else if (grade.equals("C")) {
                countC++;
            } else if (grade.equals("B")) {
                countB++;
            } else if (grade.equals("A")) {
                countA++;
            }
        }

        // Print the counts in order: D, C, B, A
        System.out.println(countD + " " + countC + " " + countB + " " + countA);

        // Close the scanner
        scanner.close();
    }
}