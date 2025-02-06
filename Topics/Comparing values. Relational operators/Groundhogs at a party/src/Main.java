import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int reesesCount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isPartySuccessful = false;

        if (isWeekend) {
            if (reesesCount >= 15 && reesesCount <= 25) {
                isPartySuccessful = true;
            }
        } else {
            if (reesesCount >= 10 && reesesCount <= 20) {
                isPartySuccessful = true;
            }
        }
        System.out.println(isPartySuccessful);
    }
}