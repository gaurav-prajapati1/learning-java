import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input how many numbers
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        // Check if n is valid
        if (n <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        // Read first number
        System.out.print("Enter number 1: ");
        int largest = sc.nextInt();

        // Compare with remaining numbers
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }
        }

        // Display result
        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}