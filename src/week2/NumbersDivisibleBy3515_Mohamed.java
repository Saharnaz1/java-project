package week2;

public class NumbersDivisibleBy3515_Mohamed {

    public static void main(String[] args) {
        int limit = 100; // You can change this limit as needed

        System.out.println("Numbers divisible by 3:");
        for (int i = 3; i <= limit; i += 3) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumbers divisible by 5:");
        for (int i = 5; i <= limit; i += 5) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumbers divisible by 15:");
        for (int i = 15; i <= limit; i += 15) {
            System.out.print(i + " ");
        }
    }
}
