import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Calculating product
        double product = num1 * num2;

        // Displaying result
        System.out.println("Product = " + product);

        sc.close();
    }
}