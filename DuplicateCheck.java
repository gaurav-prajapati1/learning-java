import java.util.Scanner;

public class DuplicateCheck {

    // Method to check duplicates
    static void checkDuplicates(int[] arr) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    throw new Exception("Duplicate number found: " + arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Check duplicates
            checkDuplicates(arr);

            System.out.println("No duplicates found.");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}