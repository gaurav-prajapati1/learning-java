import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate square
        int square = num * num;

        // Display result
        System.out.println("Square of " + num + " is: " + square);

        sc.close();
    }
}