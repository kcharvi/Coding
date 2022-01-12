
public class LCSandLPS {

	public static void main(String[] args) {
		String s = "bbbabaa";
		String t = "abbbbba";
		System.out.println(longestCommonSubsequence(s, t));
		System.out.println(longestPalindromeSubseq(s));
	}
    public static int longestPalindromeSubseq(String s) {
        int n= s.length();
        int[][] L = new int[n+1][n+1];
        
        char[] X = s.toCharArray(); 
        char[] Y = new char[n];
        
        for(int i=0;i<n;i++){
            Y[i]=X[n-i-1];
        }
        
        for(int i=0; i<n;i++){L[i][i]=1;}
        
        for (int i=0; i<=n; i++){
            for (int j=0; j<=n; j++){
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[0].length; j++) {
				System.out.print(L[i][j]+ "   ");
			}
			System.out.println();
		}
       return L[n][n];
    }
	public static int longestCommonSubsequence(String s, String t){
		int n= s.length();
		int m= t.length();
        int[][] L = new int[n+1][m+1];
        
        char[] X = s.toCharArray(); 
        char[] Y = t.toCharArray();
             
        for (int i=0; i<=n; i++){
            for (int j=0; j<=m; j++){
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[0].length; j++) {
				System.out.print(L[i][j]+ "   ");
			}
			System.out.println();
		}
       return L[n][m];
	}
}
