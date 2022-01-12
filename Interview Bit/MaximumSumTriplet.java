import java.util.*;

public class MaximumSumTriplet {
	
	 public static int solve(int[] A) {
		   int sum=0;
         int n=A.length;
         
         for(int i=1;i<n-1;i++){
             int max_prev=Integer.MIN_VALUE,max_next=Integer.MIN_VALUE;
             //boolean flag1=false,flag2=false;
             
             for(int j=i-1;j>=0;j--){
                 if(A[j]>max_prev && A[i]>A[j]){
                     max_prev=Math.max(A[j],max_prev);
                     //flag1=true;
                 }
             }
             
             for(int k=i+1;k<n;k++){
                 if(A[k]>max_next && A[k]>A[i]){
                     max_next=Math.max(A[k],max_prev);
                     //flag2=true;
                 }
             }

             if(max_prev<A[i] &&  max_next>A[i]){
                 sum=Math.max(sum,(A[i]+max_prev+max_next));
             }
             
         }
         return sum;
	 }
	
	 public static void main(String args[])
	    {
	        int A[] ={ 2, 5, 3, 1, 4, 1 }; //
	        //			 5  5  4  4	 4	1
	         int n = A.length;
	 		int rightMax[] = new int[n];
	 		rightMax[n - 1] = A[n - 1];
	 		for (int i = n - 2; i >= 0; i--) {
	 			rightMax[i] = Math.max(rightMax[i + 1], A[i]);
	 		}
	 		
	 		System.out.println(Arrays.toString(rightMax));
	 		
	 		TreeSet<Integer> set = new TreeSet<>();
	 		set.add(A[0]);
	 		int res = 0;
	 		for (int i = 1; i < n - 1; i++) {
	 			Integer lmax = set.lower(A[i]);
	 			int rmax = rightMax[i + 1];
	 			System.out.println(A[i]+"  "+lmax);
	 			if (lmax != null && A[i] < rmax) {
	 				
	 				res = Math.max(res, lmax + A[i] + rmax);
	 			}
	 			set.add(A[i]);
	 			System.out.println(set);
	 		}
	 		
	        System.out.println(solve(A));
	    }
	  


//	 		return res;
	    
	}


