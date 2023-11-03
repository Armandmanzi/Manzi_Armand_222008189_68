import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter single positive digit number:");
            int number = scanner.nextInt();
            if (number > 100) {
                break;
            }
            if (number < 0 || number >= 10) {
                System.out.println("try another number");
                continue;
            }
            System.out.println("the number is:" + number);
        }
    }
}
