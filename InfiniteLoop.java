public class InfiniteLoop {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.println("Infinite loop interation: " + count);
            count++;
        }
    }
}

