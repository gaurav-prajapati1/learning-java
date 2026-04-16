import java.util.Scanner;
import mypack.Cube;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cube c = new Cube();

        // Integer input
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.println("Cube (int): " + c.cube(i));

        // Double input
        System.out.print("\nEnter a decimal number: ");
        double d = sc.nextDouble();
        System.out.println("Cube (double): " + c.cube(d));

        sc.close();
    }
}