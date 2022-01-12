import java.util.Scanner;

public class Binary_search {
	static Scanner sc=new Scanner(System.in);
    int binarySearch(int arr[], int l, int r, int x)
      {
         if (r >= l)
         {
             int mid = l + (r - l) / 2;
             if (arr[mid] == x)
               return mid;
             if (arr[mid] > x)
               return binarySearch(arr, l, mid - 1, x);
             return binarySearch(arr, mid + 1, r, x);
         }
         return -1;
      }
    public static void main(String args[])
      {
         Binary_search ob = new Binary_search();
         int arr[] = { 9, 21, 33, 47, 56, 62, 83, 112, 234 };
         int n = arr.length;
         System.out.println("Enter the element to be searched : ");
         int x = sc.nextInt();
         int result = ob.binarySearch(arr, 0, n - 1, x);
         if (result == -1)
            System.out.println("Element not present");
         else
            System.out.println("Element found at position " + (result+1)+" with the index"+result);
      }
}
