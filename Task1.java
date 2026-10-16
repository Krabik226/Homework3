import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;
        boolean accessGranted = false;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int userPin = scanner.nextInt();

            if (userPin == correctPin) {
                System.out.println("Access granted!");
                accessGranted = true;
                break; // Exit the loop
            } else {
                attempts--;
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + attempts);
            }
        }

        if (!accessGranted) {
            System.out.println("Account blocked.");
        }
        scanner.close();
    }
}
