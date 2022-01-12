
public class LargestSubstrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res=longestPalindrome("babad");
		System.out.println(res);
	}
	public static String longestPalindrome(String s) {
        // if(s.length()==0)
        //     return "";
        if(s.length()==1)
            return s;
        boolean DP[][] = new boolean[s.length()][s.length()];
        String ans="";
        for(int p=0; p<s.length(); p++){
            int i=0;
            for(int j=p;j<s.length();j++){
                if(p==0)
                    DP[i][j]=true;
                else if(p==1)
                    DP[i][j]=  s.charAt(i) == s.charAt(j) ? true : false;
                else 
                    DP[i][j]=  s.charAt(i) == s.charAt(j) && DP[i+1][j-1] == true ? true : false;
                
                if(DP[i][j] == true) 
                    ans = s.substring(i,j+1);
                i++;
            }
        }
        for (int i = 0; i < DP.length; i++) {
			for (int j = 0; j < DP[0].length; j++) {
				System.out.print(DP[i][j]+ " " );
			}
			System.out.println();
		}
        return ans;

    }

}
