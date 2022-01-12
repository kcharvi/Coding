import java.util.*;
public class CoinsChange {
//	public static void main(String[] args) {
//	    int coins[] = {1,2,5};
//	    int amount = 11;
//	    System.out.println(coinChange(coins,amount));
//	}
	//Recursive
//    public static int coinChange(int[] coins, int amount) {
//        int minCoins=Integer.MAX_VALUE;
//        minCoins=count(coins,coins.length,amount);
//        if(minCoins==Integer.MAX_VALUE-1)return -1;
//        else return minCoins; 
//    }
//    public static int count(int[] coins, int m, int amt){
//        if(amt==0)return 0;
//        
//        if(m==0)return Integer.MAX_VALUE-1;
//        
//        if(coins[m-1]>amt)return count(coins,m-1,amt);
//                
//        return Math.min(count(coins,m-1, amt) ,1+count(coins,m, amt-coins[m - 1]));
//         
//    }
	
	//DP
//	public static int coinChange(int[] coins, int amount) {
//		int n=coins.length;
//        int[][] dp = new int[n+1][amount+1];
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=amount;j++){
//                if(i == 0)
//                    dp[i][j]=Integer.MAX_VALUE-1;
//                else if(j==0)
//                    dp[i][j] = 0;
//                else{
//                        dp[i][j]=dp[i-1][j];
//                        if(coins[i-1] <= j)
//                            dp[i][j]=Math.min( dp[i][j],1 + dp[i][j-coins[i-1]]);
//
//                    } 
//            }
//        }
//        for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				System.out.print(dp[i][j]+ "  ");
//			}
//			System.out.println();
//		}
//        return (dp[n][amount] == Integer.MAX_VALUE-1)?-1:dp[n][amount];
//	}
	
	///* Dynamic Programming Java implementation of Coin

	static long countWays(int S[], int m, int n)
	{
		//Time complexity of this function: O(mn)
		//Space Complexity of this function: O(n)

		// table[i] will be storing the number of solutions
		// for value i. We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		long[] table = new long[n+1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); //O(n)

		// Base case (If given value is 0)
		table[0] = 1;

		// Pick all coins one by one and update the table[]
		// values after the index greater than or equal to
		// the value of the picked coin
		for (int i=0; i<m; i++) {
			System.out.println();
//			for (int t = 0; t < table.length; t++) {
//				System.out.print(table[t]+ "  ");
//			}
			for (int j=S[i]; j<=n; j++) {
				table[j] += table[j-S[i]];
			}
			
			
		}
		

		System.out.println();
		for (int t = 0; t < table.length; t++) {
			System.out.print(table[t]+ "  ");
		}
		System.out.println();
		return table[n];
	}

	// Driver Function to test above function
	public static void main(String args[])
	{
		int coins[] = {1,2,5};
	    int amount = 11;
	    int m=coins.length;
	    System.out.println(countWays(coins,m,amount));
	}
}
