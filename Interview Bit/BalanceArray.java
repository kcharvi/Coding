
public class BalanceArray {

	public static int solve(int[] nums) {
	  int n = nums.length;
         int[] leftOdd = new int[n];
         int[] leftEven = new int[n];
         int[] rightOdd = new int[n];
         int[] rightEven = new int[n];
         int odd = 0, even = 0; 
         for(int i=0;i<n;i++){      //loop to calculate even and odd sums in left part(0 to i-1)
             leftOdd[i] = odd;
             leftEven[i] = even;
             if(i%2==0) even += nums[i];
             else odd += nums[i];
         }
         odd = 0;
         even = 0;
         for(int i=n-1;i>=0;i--){  //loop to calculate even and odd sums in right part(i+1 to n)
             rightOdd[i] = odd;
             rightEven[i] = even;
             if(i%2==0) even += nums[i];
             else odd += nums[i];
         }
         int count = 0;
         for(int i=0;i<n;i++){   //loop to check if number is special
             if(leftOdd[i] + rightEven[i] == leftEven[i] + rightOdd[i]){
                count++;
             }
         }
         return count;
}
	 public static void main(String args[])
	    {
	        int A[] ={ 2, 1, 6, 4  }; //
	        //			 5  5  4  4	 4	1
	        System.out.println(solve(A));
	    
	    }
}
