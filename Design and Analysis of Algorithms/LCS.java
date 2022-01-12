import java.util.*;
public class LCS {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		<B, A, B, A, B, A, B, A
		//B, A, B, A, A, B, A, A, B>
		String x="BABABABA";//sc.next();
		String y="BABAABAAB";//sc.next();
		System.out.println(x);
		System.out.println(y);
		int m=x.length();
		int n=y.length();
		int[][] c = new int[m+1][n+1];
		int b[][] = new int[m+1][n+1]; //up:1 , left:2 , left-up:3
		
		for(int i=0;i<m+1;i++)c[i][0]=0;
		
		for(int i=0;i<n+1;i++)c[0][i]=0;
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1 ; j < n+1; j++) {
				if(x.charAt(i-1)==y.charAt(j-1)) {
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=3;
				}
				else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j]=c[i-1][j];
					b[i][j]=1;
				}
				else {
					c[i][j]=c[i][j-1];
					b[i][j]=2;
				}
			}
		}
		
		System.out.println("The length of the longest sequence is: "+ c[m][n]);
		System.out.println("The longest sequence  is: ");
		PL(b,x,m,n);
		System.out.println();
		System.out.println("Dp matrix:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sequence matrix:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		sc.close();
	}

	public static void PL(int[][] b, String x, int i, int j) {
		if(i==0 || j==0)return;
		
		if(b[i][j]==3) {
			PL(b,x,i-1,j-1);
			System.out.print(x.charAt(i-1)+" ");
		}
		else if(b[i][j]==1) {
			PL(b,x,i-1,j);
		}
		else {
			PL(b,x,i,j-1);
		}
	}
	
}
