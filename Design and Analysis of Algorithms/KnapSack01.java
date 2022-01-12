import java.util.*;
public class KnapSack01 {
	static int max(int a, int b){
		return (a > b) ? a : b;
	}

	static int knapSack(int W, int wt[],int val[], int n){
		int i, w;
		int K[][] = new int[n + 1][W + 1];
		int[] X=new int[n+1];
		for (i = 0; i <= n; i++){
			for (w = 0; w <= W; w++){
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w) 
					K[i][w] = max(val[i - 1]+ K[i - 1][w - wt[i - 1]]  ,  K[i - 1][w]);
				
				else 
					K[i][w] = K[i - 1][w];
			}
			
		}
		printdp(K);
		System.out.println();

		System.out.println();
		return K[n][W];
		
	}

	public static void printdp(int[][] k) {
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[0].length; j++) {
				System.out.print(k[i][j]+  "  ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		int val[] = new int[] { 60,15,30,80,20 };
		int wt[] = new int[]  { 5,2,10,8,6};
		int W = 15;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}
