package week3.day1;

public class ReverseOddWords {
public static void main(String[] args) 
{
    String test = "I am a software tester";
    
    // Step 1: Split words into an array
    String[] words = test.split(" ");
    
    // Step 2: Traverse through each word
    for (int i = 0; i < words.length; i++) {
        
        // Step 3: Check if the index is odd (1-based position)
        if (i % 2 != 0) {
            // Step 4: Convert the word into a char array
            char[] chars = words[i].toCharArray();
            
            // Step 5: Print the word in reverse using another loop
            for (int j = chars.length - 1; j >= 0; j--) {
                System.out.print(chars[j]);
            }
        } else {
            // Step 6: Print even position words directly
            System.out.print(words[i]);
        }
        
        // Add space after each word
        if (i < words.length - 1) {
            System.out.print(" ");
        }
    }
}
}