// Program to calculate factorial of a number using recursion
import java.util.*;

class Factorial {
    // Recursive method to calculate factorial
    static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;  // Base case
        }
        return n * factorial(n - 1);     // Recursive call
    }
    //main function
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        //Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //Calculate factorial using recursion function
        int result = factorial(num);
        // Print the result(factorial
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
