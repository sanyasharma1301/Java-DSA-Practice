// Program to reverse the order of words in a sentence

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseSentence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        // Tokenize the sentence into words
        StringTokenizer tokenizer = new StringTokenizer(s);
        int count = tokenizer.countTokens();
        String[] reverse = new String[count];

        int i = count - 1;
        while (tokenizer.hasMoreTokens()) {
            reverse[i] = tokenizer.nextToken();
            i--;
        }

        // Print the reversed sentence
        System.out.println("The sentence in reversed word order:");
        for (int j = 0; j < count; j++) {
            System.out.print(reverse[j] + " ");
        }
    }
}
