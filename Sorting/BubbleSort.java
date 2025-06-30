//bubble sort technique to sort array
import java.util.*;
class bubble_sort
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
        //bubble sort
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])//ascending order
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //printing the sorted array
        System.out.println("The Sorted Array is: ");
        for(int i=0;i<n;i++)//user input to fill the array
        {
            System.out.print(arr[i]+" ");
        }
    }
}
        
