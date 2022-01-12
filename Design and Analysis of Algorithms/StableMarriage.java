import java.util.*;
public class StableMarriage{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of people: ");
		int n=sc.nextInt();
		int[][] w_preference = new int[n][n];
		for (int i = 0; i < w_preference.length; i++) {
			for (int j = 0; j < w_preference.length; j++) {
				w_preference[i][j]=sc.nextInt();
			}
		}
		
		/*
		 * 
4
3
4
2
1
3
1
4
2
2
3
4
1
3
2
1
4
1
2
3
4
1
4
3
2
2
1
3
4
4
2
3
1
		 */
		
		int[][] m_preference = new int[n][n];
		for (int i = 0; i < m_preference.length; i++) {
			for (int j = 0; j < m_preference.length; j++) {
				m_preference[i][j]=sc.nextInt();
			}
		}
		
		int[] w=new int[n];
		Arrays.fill(w, -1);
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int k=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) 
			{
				boolean flag=false;
				while(!flag) {
				if(m_preference[i][j]==k) {
					int x=0;
					if(w[j]==-1) {
						w[j]=i+1;
						x=w_preference[j][i];
						k=1;
						flag=true;
					}
				
					else {
						if(w_preference[j][i]< x ) {
							w[j]=i+1;
							k=1;
							flag=true;
						}
						else {
							k++;
							
							
						}
					
						
					}
				}

				}
				if(flag==true)break;
			}
		}
		System.out.println(Arrays.toString(w));
	}
}
	
	
	
//	int temp=1,idx=0;
//	while(temp<=n || idx<n) {
//		if(idx>=n)idx=0;
//		if(w[idx]==temp)temp++;
//		else idx++;
//	}