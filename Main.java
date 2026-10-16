import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. While loop i <= 1000, multiply by 10
        System.out.println("--- Task 1 ---");
        int i = 1;
        while (i <= 1000) {
            System.out.print("Before: " + i);
            i = i * 10;
            System.out.println(" After: " + i);
        }

        // 2. For loop with same functionality
        System.out.println("\n--- Task 2 ---");
        for (int j = 1; j <= 1000; j = j * 10) {
            System.out.print("Before: " + j);
            int k = j * 10;
            System.out.println(" After: " + k);
        }

        // 3. Print numbers from 1 to N using while, do-while, for
        System.out.println("\n--- Task 3 ---");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.println("Using while:");
        int a = 1;
        while (a <= n) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        System.out.println("Using do-while:");
        int b = 1;
        if (n >= 1) {
            do {
                System.out.print(b + " ");
                b++;
            } while (b <= n);
        }
        System.out.println();

        System.out.println("Using for:");
        for (int c = 1; c <= n; c++) {
            System.out.print(c + " ");
        }
        System.out.println();


        // 5. Print Even Numbers up to N using 3 types of loops
        System.out.println("\n--- Task 5: Even Numbers ---");
        System.out.println("Using while:");
        int e1 = 2;
        while (e1 <= n) {
            System.out.print(e1 + " ");
            e1 = e1 + 2;
        }
        System.out.println();

        System.out.println("Using do-while:");
        int e2 = 2;
        if (n >= 2) {
            do {
                System.out.print(e2 + " ");
                e2 = e2 + 2;
            } while (e2 <= n);
        }
        System.out.println();

        System.out.println("Using for:");
        for (int e3 = 2; e3 <= n; e3 = e3 + 2) {
            System.out.print(e3 + " ");
        }
        System.out.println();

        // 6. Print Odd Numbers up to N using 3 types of loops
        System.out.println("\n--- Task 6: Odd Numbers ---");
        System.out.println("Using while:");
        int o1 = 1;
        while (o1 <= n) {
            System.out.print(o1 + " ");
            o1 = o1 + 2;
        }
        System.out.println();

        System.out.println("Using do-while:");
        int o2 = 1;
        if (n >= 1) {
            do {
                System.out.print(o2 + " ");
                o2 = o2 + 2;
            } while (o2 <= n);
        }
        System.out.println();

        System.out.println("Using for:");
        for (int o3 = 1; o3 <= n; o3 = o3 + 2) {
            System.out.print(o3 + " ");
        }
        System.out.println();

        // 7. FizzBuzz
        System.out.println("\n--- Task 7: FizzBuzz ---");
        for (int num = 1; num <= 20; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }


        scanner.close();
    }
}
