import java.util.*;

class TwistedPrime
{
    // Recursive method to check if a number is prime
    static boolean isPrime(int n, int i) 
    {
        if (n < 2) 
            return false;
        if (i == 1) 
            return true;
        if (n % i == 0) 
            return false;
        return isPrime(n, i - 1);
    }
    // Recursive method to reverse a number
    static int reverse(int n, int rev) 
    {
        if (n == 0) 
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }
    // Method to check twisted prime
    static boolean isTwistedPrime(int n)
    {
        int rev = reverse(n, 0);
        return isPrime(n, n - 1) && isPrime(rev, rev - 1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (isTwistedPrime(n)) 
        {
            int reversed = reverse(n, 0);
            System.out.println(n + " and " + reversed + " are both prime.");
            System.out.println("Hence it is a Twisted Prime.");
        } 
        else 
        {
            System.out.println("It is not a Twisted Prime.");
        }
    }
}
