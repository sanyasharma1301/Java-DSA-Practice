
// Program to check if a word is a palindrome by reversing it recursively

import java.util.*;

class PalindromeCheck {
    
    // Recursive method to reverse a string
    static String reverse(String s, int l) {
        if (l >= 0) {
            return s.charAt(l) + reverse(s, l - 1); 
        }
        return ""; // base case: return empty string
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        // Get reversed string
        String rev = reverse(s, s.length() - 1);

        // Check if input is same as reversed
        if (s.equals(rev)) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
