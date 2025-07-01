//program to search a number using Binary search(UNSORTED)
import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for(int i=0;i<n;i++)//take user input array
        {
            arr[i]=sc.nextInt();
        }
        //for binary search the array should be sorted
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])//ascending order
                {
                    int temp = arr[j];//swap elements
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //Input element to search
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        //Binary search logic
        int low=0,high=n-1,found=0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("Element found at index: "+mid);
                found=1;
                break;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(found!=1)
        {
            System.out.println("Element not found in the array.");
        }
    }
}
