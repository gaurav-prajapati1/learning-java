import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of names
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];

        // Input names
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort names
        Arrays.sort(names);

        // Display sorted names
        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}