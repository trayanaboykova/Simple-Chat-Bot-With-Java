import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        boolean isTrue = true;

        if (value < 10) {
            System.out.println(isTrue);
        } else {
            System.out.println(!isTrue);
        }
    }
}