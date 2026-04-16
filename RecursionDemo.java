import java.util.Scanner;

public class RecursionDemo {

    // -------- Factorial (Recursive) --------
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    // -------- Factorial (Non-Recursive) --------
    static int factorialIterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // -------- Fibonacci (Recursive) --------
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // -------- Fibonacci (Non-Recursive) --------
    static void fibonacciIterative(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Factorial
        System.out.println("Factorial (Recursive): " + factorialRecursive(n));
        System.out.println("Factorial (Iterative): " + factorialIterative(n));

        // Fibonacci
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        fibonacciIterative(n);

        sc.close();
    }
}