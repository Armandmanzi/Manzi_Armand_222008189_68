import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 12345; // Question
        int attempts = 0;
        int maxAttempts = 3;
        // System.out.println("Enter your password:");
        while (attempts < maxAttempts) {
            System.out.println("Enter your password: ");
            int userpassword = scanner.nextInt();
            attempts++;

            if (userpassword == password) {
                System.out.println("phone unlocked");
                break; // Exit the loop if the guess is correct
            } else if (userpassword != password) {
                System.out.println("Invalid Try again.");
            } else {
                System.out.println("Invalid Try again.");
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("try again after some time!");
        }
    }
}
