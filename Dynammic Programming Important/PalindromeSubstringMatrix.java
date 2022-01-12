
public class PalindromeSubstringMatrix {
	public static void main(String[] args) {
		String str="ababb";
		buildMatrix(str);
	}
	static void buildMatrix(String str) {
		int n=str.length();
		boolean dp[][] = new boolean[n][n];
		for(int i=n-1;i>=0;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(i+""+j+" ");
				if (str.charAt(i) == str.charAt(j) && 
						(i - j < 2 || dp[j + 1][i - 1]) ) 
                    dp[i][j] = true;
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i+" "+j+" ");
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
