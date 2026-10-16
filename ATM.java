import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("===SIMPLE ATM===");

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int userPin = scanner.nextInt();

            if (userPin == correctPin) {
                System.out.println("Login successful!");
                loggedIn = true;
                break; // Exit the loop
            } else {
                attempts--;
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + attempts);
            }
        }

        if (!loggedIn) {
            System.out.println("Account blocked.");
            scanner.close();
            return;
        }

        double balance = 1000.00;
        boolean exit = false;

        while (!exit){
            System.out.println("\n===ATM MENU==");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.println("Choose operation: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Your balance is: " + balance + " $");
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit succcessful.New balance: " + balance + " $");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance){
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.New balance: " + balance + " $");
                    }
                    else{
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Good bye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Choose 1-4.");
            }
        }
        scanner.close();
    }
}
