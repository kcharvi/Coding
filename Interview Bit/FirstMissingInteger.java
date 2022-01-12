import java.util.*;

public class FirstMissingInteger {
	 public static void main(String args[])
	    {
	        int A[] ={ 2, 1, 6, 4  }; //
	        //			 5  5  4  4	 4	1
	        System.out.println(solve(A));
	    
	    }
	 
	 public static int solve(int[] A) {
	        Arrays.sort(A);
	        int i=0;
	        int index=0;
	        if(A.length == 0 || A[A.length-1] <= 0) return 1;
	       // int num=0;
	        if(A[A.length-1]==1)return 2;
	        while(i<A.length){
	            if(A[i]>0){
	                index=i;
	                break;
	            }
	              i++;
	        }
	        int j=1;
	        while(j!=A[A.length-1])
	        {
	            if(j<A[index])return j;
	            else if(j > A[index]) index += 1;
	            else j += 1;
	        }
	        return A.length+1;
}
	 }
