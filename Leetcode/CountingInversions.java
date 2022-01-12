import java.util.*;
public class CountingInversions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 1, 20, 6, 4, 5 };
		int[] arr = {1,20,6,7,5,8,11,3};
		 
        System.out.println(countInv(arr));
    
	}
	public static int countInv(int[] arr) {
		int l=0, r=arr.length-1;
		return sort(arr,l,r);				
		
	}
	public static int sort(int[] arr, int l, int r) {
		int cnt=0;
		if(l<r) {
			int mid=l+(r-l)/2;
			cnt+=sort(arr,l,mid);
			cnt+=sort(arr,mid+1,r);
			cnt+=merge(arr,l,mid,r);
		}
		return cnt;
	}
	public static int merge(int[] arr,int l, int mid, int r) {
		//temp array helper for storing those values 
		//from arr which are being merged
		int[] helper=new int[l+(r+1-l)];
		
		for (int i = l; i <= r; i++) {
			helper[i]=arr[i];
		}
		int i=l,j=mid+1,k=l,swaps=0;
		
		while(i<=mid && j<=r) {
			if(helper[i]<=helper[j]) {
				arr[k++]=helper[i++];
			}
			else {
				arr[k++]=helper[j++];
				//System.out.println(swaps);
				swaps += (mid + 1) - (l + i);
			}
			
		}
		while(i<=mid) 
			arr[k++]=helper[i++];
			
		while (j <=r)
            arr[k++] = helper[j++];
		
		return swaps;	
	}
}

 //   private static int mergeAndCount(int[] arr, int l,
//            int m, int r)
//{
//
//// Left subarray
//int[] left = Arrays.copyOfRange(arr, l, m + 1);
//
//// Right subarray
//int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
//
//int i = 0, j = 0, k = l, swaps = 0;
//
//while (i < left.length && j < right.length) {
//if (left[i] <= right[j])
//arr[k++] = left[i++];
//else {
//arr[k++] = right[j++];
//swaps += (m + 1) - (l + i);
//}
//}
//while (i < left.length)
//arr[k++] = left[i++];
//while (j < right.length)
//arr[k++] = right[j++];
//return swaps;
//}
//
//// Merge sort function
//private static int mergeSortAndCount(int[] arr, int l,
//                int r)
//{
//
//// Keeps track of the inversion count at a
//// particular node of the recursion tree
//int count = 0;
//
//if (l < r) {
//int m = (l + r) / 2;
//
//// Total inversion count = left subarray count
//// + right subarray count + merge count
//
//// Left subarray count
//count += mergeSortAndCount(arr, l, m);
//
//// Right subarray count
//count += mergeSortAndCount(arr, m + 1, r);
//
//// Merge count
//count += mergeAndCount(arr, l, m, r);
//}
//
//return count;
//}
//
//// Driver code
//public static void main(String[] args)
//{
//	int[] arr = {1,20,6,7,5,8,11,3};
//
//System.out.println(
//mergeSortAndCount(arr, 0, arr.length - 1));
//}
//}
