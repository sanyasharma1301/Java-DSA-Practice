// Program to print the Fibonacci series using recursion
import java.util.*;
class fibonacci
{
    static int a=0,b=1,c=0;
    static void fibo(int i, int n)
    {
        if(i<=n)
        {// Recursive method to calculate nth Fibonacci number
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
            fibo(i+1,n);
        }
    }
    static void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("The fibonacci sequence upto "+n+" is: ");
        System.out.print(a+" "+b+" ");
        fibo(3,n);
    }
    public static void main()
    {
        display();
    }
}
