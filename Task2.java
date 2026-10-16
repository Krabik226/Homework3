import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int SecretNum = 7;
        int maxAttempts = 5;
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < SecretNum) {
                System.out.println("Too low.");
            } else if (guess > SecretNum) {
                System.out.println("Too high.");
            } else {
                System.out.println("Correst!");
                System.out.println("You needed " + attempts + " attempts");
                guessedCorrectly = true;
                break;
            }
        }
        if (!guessedCorrectly){
            System.out.println("GAME OVER");
        }
        scanner.close();
    }
}
