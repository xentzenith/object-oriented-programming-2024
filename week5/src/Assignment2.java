import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text input:");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Input is empty.");
        } else {
            int wordCount = countWords(input);
            System.out.println("Total word count: " + wordCount);
        }

        scanner.close();
    }

    private static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
