
// Program to check if two strings are anagrams (same letters, different order)

import java.util.*;

public class IsAnagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 strings: ");
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("The strings are NOT anagrams (length mismatch).");
            return;
        }

        // Convert to character arrays
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
