
// Program to convert a word into Pig Latin format

/*
Pig Latin Rules:
- If a word starts with a vowel → add "way" to the end
  Example: "apple" → "appleway"
- If a word starts with a consonant → move the letters before the first vowel to the end, then add "ay"
  Example: "hello" → "ellohay"
*/

import java.util.*;

class PigLatin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.nextLine();

        int len = s.length();
        String str = s.toUpperCase(); // for uniform vowel check
        int in = -1;

        // Find position of the first vowel
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                in = i;
                break;
            }
        }

        if (in == -1) {
            System.out.println("No vowels found. Cannot convert to Pig Latin.");
        } else if (in == 0) {
            System.out.println(s.toUpperCase() + "WAY");
        } else {
            String sub1 = str.substring(0, in);
            String sub2 = str.substring(in, len);
            System.out.println(sub2 + sub1 + "AY");
        }
    }
}
