import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordCounter {
    public static void main(String[] args) {




        String fileName = "text.txt";
        String searchWord = "hello";
        int count = 0;


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + searchWord + "' appears " + count + " times in " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
