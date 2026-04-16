import java.util.Scanner;

public class TextCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int charCount = 0, wordCount = 0, lineCount = 0;

        System.out.println("Enter text (type 'END' to finish):");

        while (true) {
            String line = sc.nextLine();

            // Stop condition
            if (line.equals("END")) {
                break;
            }

            lineCount++;

            // Count characters (excluding newline)
            charCount += line.length();

            // Count words
            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                wordCount += words.length;
            }
        }

        // Display results
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);

        sc.close();
    }
}