import java.util.*;
public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Number of matrices to multiply: ");
		int n=sc.nextInt();
		System.out.println("Enter the array of dimensions of matrix: ");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		int[][] dp = new int[n][n];
		int[][] s = new int[n][n];
		
        for (int i = 1; i < n; i++)
            dp[i][i] = 0;
 
        for (int L= 2; L<n; L++){
            for (int i = 1; i < n - L + 1; i++){
                int j = i + L - 1;
                if (j == n)continue;
                
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++){
                	int cost = dp[i][k] + dp[k + 1][j]+ arr[i - 1] * arr[k] * arr[j];
                    if (cost < dp[i][j]) {
                    	dp[i][j] = cost;
                    	s[i][j]=L;
                    }
                }
            }
        } 
		
		System.out.println("Min cost of the matrix multiplication: "+ dp[1][n-1]);
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.print(s[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
