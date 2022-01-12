import java.util.Scanner;
public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("MERGE SORT: ");
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements into array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		mergeSort(arr,0,n-1);
	}

	public static void mergeSort(int[] arr, int lo, int hi) {
		if(lo<hi) {
			int mid=hi-(lo+hi)/2;
			mergeSort(arr,lo,mid);
			mergeSort(arr,mid+1,hi);
			merge(arr,lo,mid,hi);
		}
	}

	public static void merge(int[] arr, int lo, int mid, int hi) {
		int n1=mid-lo+1;
		int n2=hi-mid;
		int L[] =new int[n1];
		int R[] =new int[n2];
		for (int i = 0; i < n1; i++) 
			L[i]=arr[lo+i];
		for (int j = 0; j < n2; j++) 
			R[j]=arr[mid+1+j];
		
		int i =0,j=0,k=lo;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;k++;
		}
	}
	

}
