import java.util.Scanner;

public class SimpleStoreCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = 0;
        int totalItems = 0;
        int countMouse = 0, countKeyboard = 0, countHeadphones = 0, countStand = 0;
        boolean shopping = true;

        // Main shopping loop
        while (shopping) {
            System.out.println("\n==== SIMPLE STORE ====");
            System.out.println("1. Mouse - $20");
            System.out.println("2. Keyboard - $40");
            System.out.println("3. Headphones - $50");
            System.out.println("4. Laptop Stand - $30");
            System.out.println("5. Checkout");
            System.out.print("Choose a product: ");

            int choice = scanner.nextInt();

            // Validate product choice
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid option. Please choose a number from 1 to 5.");
                continue;
            }

            // Checkout
            if (choice == 5) {
                shopping = false;
                break;
            }

            // Set product details
            String name = "";
            double price = 0;
            if (choice == 1) { name = "Mouse"; price = 20; }
            else if (choice == 2) { name = "Keyboard"; price = 40; }
            else if (choice == 3) { name = "Headphones"; price = 50; }
            else if (choice == 4) { name = "Laptop Stand"; price = 30; }

            System.out.println("You selected: " + name + " Price: $" + price);
            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();

            // Validate quantity
            if (qty <= 0) {
                System.out.println("Invalid quantity. Quantity must be greater than 0.");
                continue;
            }

            // Bonus 1: 5% discount for 5+ of same item
            double itemTotal = qty * price;
            if (qty >= 5) {
                itemTotal = itemTotal - (itemTotal * 0.05);
                System.out.println("You received a 5% discount on this item!");
            }

            subtotal = subtotal + itemTotal;
            totalItems = totalItems + qty;

            // Track product types (Bonus 3)
            if (choice == 1) countMouse = countMouse + qty;
            else if (choice == 2) countKeyboard = countKeyboard + qty;
            else if (choice == 3) countHeadphones = countHeadphones + qty;
            else if (choice == 4) countStand = countStand + qty;

            System.out.println("Added to cart! Current total: $" + subtotal);
        }

        // Checkout
        System.out.println("\n==== CHECKOUT ====");
        System.out.println("Items purchased: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);

        // Bonus 2: Different discount levels
        double discount = 0;
        if (subtotal >= 200) {
            discount = subtotal * 0.15;
            System.out.println("You received a 15% discount!");
        } else if (subtotal >= 100) {
            discount = subtotal * 0.10;
            System.out.println("You received a 10% discount!");
        }

        double finalTotal = subtotal - discount;
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);

        // Payment loop
        double payment = 0;
        while (payment < finalTotal) {
            System.out.print("Enter payment amount: $");
            payment = scanner.nextDouble();
            if (payment < finalTotal) {
                System.out.println("Insufficient payment. You still need to pay: $" + (finalTotal - payment));
            }
        }

        double change = payment - finalTotal;
        System.out.println("Payment successful!");

        // Bonus 4: Most purchased product
        String mostProduct = "Mouse";
        int mostQty = countMouse;
        if (countKeyboard > mostQty) { mostProduct = "Keyboard"; mostQty = countKeyboard; }
        if (countHeadphones > mostQty) { mostProduct = "Headphones"; mostQty = countHeadphones; }
        if (countStand > mostQty) { mostProduct = "Laptop Stand"; mostQty = countStand; }

        // Final Receipt
        System.out.println("\nSIMPLE STORE");
        System.out.println("Items purchased: " + totalItems);
        System.out.println("==== ITEMS PURCHASED ====");
        System.out.println("Mouse: " + countMouse);
        System.out.println("Keyboard: " + countKeyboard);
        System.out.println("Headphones: " + countHeadphones);
        System.out.println("Laptop Stand: " + countStand);
        if (mostQty > 0) {
            System.out.println("Most purchased product: " + mostProduct + " Quantity: " + mostQty);
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);
        System.out.println("Payment: $" + payment);
        System.out.println("Change: $" + change);
        System.out.println("Thank you for shopping!");
    }
}