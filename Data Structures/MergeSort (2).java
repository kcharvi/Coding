import java.util.*;
public class MergeSort {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("MERGE SORT");
	        System.out.println("Enter size: ");
	        int n=sc.nextInt();
	        int[] A=new int[n];

	        System.out.println("Enter elements");
	        for(int i=0;i<n;i++){
	            A[i]=sc.nextInt();
	        }
	        mergesort(A,0,n-1);
	        System.out.println("After sorting using Merge Sort");
	        for(int x:A)System.out.print(x+" ");
	        
	    }
	    public static void mergesort(int[] A,int p,int r){
	        if(p<r){
	            int q=(p+r)/2;
	            mergesort(A,p,q);
	            mergesort(A,q+1,r);
	            merge(A,p,q,r);
	        }
	    }
	    public static void merge(int arr[], int p, int q, int r)
	    {
	        int n1 = q - p + 1;
	        int n2 = r - q;
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	  
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[p + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[q + 1 + j];
	  
	        int i = 0, j = 0;
	        int k = p;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	  
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	  
//	    public static void merge(int[] A,int p, int q, int r){
//	        int n1=q-p+1;
//	        int n2=r-q;
//	        int left[] = new int[n1];
//	        int right[] = new int[n2];
//	       
//	        for(int i=0;i<n1;i++)left[i]=A[p+i];
//	       
//	        for(int j=0;j<n2;j++)right[j]=A[p+j+1];
//	       
////	        left[n1-1]=Integer.MAX_VALUE;
////	        right[n2-1]=Integer.MAX_VALUE;
//	       
//	        int i=0,j=0;
//	        for(int k=p;k<=r;k++){
//	            if(i<n1 && j<n2 && left[i]<=right[j]){
//	                A[k]=left[i];
//	                i++;
//	            }
//	            else if(j<n2){
//	                A[k]=right[j];
//	                j++;
//	            }
//	        }
//	       
	               
//	    }
}
