import java.util.Scanner; public class Task2TextAnalysis {     public static void main(String[] args) { 
 
        Scanner input = new Scanner(System.in); 
 
        System.out.println("Enter a text of 2-3 lines."); 
        System.out.println("Type each line and press Enter:"); 
 
        String[] lines = new String[3];         int lineCount = 0;         while (lineCount < 3) { 
            System.out.print("Line " + (lineCount + 1) + ": ");             String line = input.nextLine(); 
 
            if (line.isEmpty()) {                 break; 
            } 
 
            lines[lineCount] = line;             lineCount++; 
        } 
 
        int wordCount = 0;         int vowelCount = 0;         for (int i = 0; i < lineCount; i++) { 
 
            String line = lines[i]; 
            String[] words = line.trim().split("\\s+"); 
 
   if (!line.trim().isEmpty()) { 
                wordCount += words.length; 
            } 
            for (int j = 0; j < line.length(); j++) { 
 
                char ch = Character.toLowerCase(line.charAt(j)); 
                 if (ch == 'a' || ch == 'e' || ch == 'i'                         || ch == 'o' || ch == 'u') {                     vowelCount++; 
                } 
            } 
        } 
        String[] uniqueWords = new String[wordCount];         int[] wordFrequency = new int[wordCount];         int uniqueCount = 0; 
 
        for (int i = 0; i < lineCount; i++) { 
 
            String[] words = lines[i].toLowerCase() 
                    .trim() 
                    .split("\\s+"); 
 
            for (String word : words) { 
 
                // Remove punctuation 
                word = word.replaceAll("[^a-zA-Z0-9]", ""); 
 
                if (word.isEmpty()) {                     continue; 
                } 
 
                int index = -1; 
                for (int j = 0; j < uniqueCount; j++) {                     if (uniqueWords[j].equals(word)) {                         index = j;                         break; 
                    } 
                } 
 
                if (index == -1) { 
                    uniqueWords[uniqueCount] = word;                     wordFrequency[uniqueCount] = 1;                     uniqueCount++; 
                } else { 
                    wordFrequency[index]++; 
                } 
            } 
        } 
        System.out.println("\n========== TEXT ANALYSIS ==========");  
        System.out.println("Number of Lines  : " + lineCount); 
        System.out.println("Number of Words  : " + wordCount); 
        System.out.println("Number of Vowels : " + vowelCount);  
        System.out.println("\nWord-wise Count:"); 
 
        for (int i = 0; i < uniqueCount; i++) { 
            System.out.println(uniqueWords[i] + " = " + wordFrequency[i]);         }  
        input.close(); 
    } 
} 
 
