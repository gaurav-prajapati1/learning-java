import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("In this program we taking input from the user !");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter tha value of num1 : ");
        int num1 = x.nextInt();
        System.out.print("Enter the value of num2 : ");
        int num2 = x.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum both number is : ");
        System.out.println(sum);

    }
    
}
