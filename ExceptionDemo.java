import java.util.Scanner;

// Custom Exception Class
class UnderAge extends Exception {
    int age;

    UnderAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Under Age: " + age;
    }
}

// Main class
public class ExceptionDemo {

    // Method to check age
    static void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            test(age);
        }
        catch (UnderAge e) {
            System.out.println(e); // calls toString()
        }

        sc.close();
    }
}