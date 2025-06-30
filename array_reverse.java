//reversing an array using a temporary array
import java.util.*;
class array_reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();//size of the array
        int arr[] = new int[n];
        int reversed[] = new int[n];
        System.out.println("Enter the number of elements in the array: ");
        for(int i=0;i<n;i++)//user input to fill the array
        {
            arr[i]=sc.nextInt();
        }
        //reversing the array using index logic
        for(int i=0;i<n;i++)
        {
            reversed[i] = arr[n - 1 - i];
        }
        //printing the reversed array
        System.out.println("The reversed array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(reversed[i]+" ");
        }
    }
}
