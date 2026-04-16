public class WelcomeStudent {
    public static void main(String[] args) {

        // Check if both name and surname are provided
        if (args.length < 2) {
            System.out.println("Please provide name and surname as command-line arguments.");
            return;
        }

        // Get name and surname
        String name = args[0];
        String surname = args[1];

        // Print welcome message
        System.out.println("Welcome " + name + " " + surname + "!");
    }
}