import java.util.*;
public class MaxSumSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]A = {
		        {1, 1, 1, 1, 1},
		        {2, 2, 2, 2, 2},
		        {3, 8, 6, 7, 3},
		        {4, 4, 4, 4, 4},
		        {5, 5, 5, 5, 5}
		        };
		 int B = 3;
		 System.out.println(solve(A,B));
	}
	public static int solve(int[][] A, int B) {
        int n=A.length;
        int sum[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
        	
            for(int j=1;j<=n;j++){
            	
                sum[i][j]=A[i-1][j-1] + sum[i][j-1] +sum[i-1][j] - sum[i-1][j-1];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
         for(int i=0;i<=n;i++){
             for(int j=0;j<=n;j++){
                 System.out.print(sum[i][j]+" ");
             }
             System.out.println();
         }
        int maxSum=Integer.MIN_VALUE;
        if(B>n)return -1;
        
        for(int i=1;i<=n-B+1;i++){
            for(int j=1;j<=n-B+1;j++){
                int currSum=sum[i+B-1][j+B-1]-sum[i-1][j+B-1]-sum[i+B-1][j-1] + sum[i-1][j-1];
                maxSum=Math.max(currSum,maxSum);
                System.out.println(currSum);
            }
        }
        
        return maxSum;
        
    }
}
