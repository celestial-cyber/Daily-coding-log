import java.util.Scanner;

public class prg6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read the sentence
        String sentence = in.nextLine();
        
        // Split sentence into words using spaces
        String[] words = sentence.split("\\s+");
        
        // Initialize variables
        String maxWord = "";
        String secondMaxWord = "";
        String minWord = null; // Start as null to easily grab the very first word
        
        for (String word : words) {
            // --- 1. LOGIC FOR SHORTEST WORD (MIN) ---
            if (minWord == null || word.length() < minWord.length()) {
                minWord = word;
            }
            
            // --- 2. LOGIC FOR MAX AND SECOND MAX ---
            // If the current word is strictly longer than the absolute longest word
            if (word.length() > maxWord.length()) {
                secondMaxWord = maxWord; // Old max drops down to second place
                maxWord = word;          // Current word becomes the new leader
            } 
            // If it's not longer than max, but longer than second max
            else if (word.length() > secondMaxWord.length() && !word.equals(maxWord)) {
                secondMaxWord = word;    // Update runner-up
            }
        }
        
        // Print the results
        System.out.println("Longest Word (Max): " + maxWord + " (Length: " + maxWord.length() + ")");
        System.out.println("Second Longest Word (Second Max): " + secondMaxWord + " (Length: " + secondMaxWord.length() + ")");
        System.out.println("Shortest Word (Least Max): " + (minWord != null ? minWord : "") + " (Length: " + (minWord != null ? minWord.length() : 0) + ")");
        
        in.close();
    }
}