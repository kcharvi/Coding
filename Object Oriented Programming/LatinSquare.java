import java.util.*;

public class LatinSquare {
		static boolean check(int X[]) {
		for(int i=1;i<X.length;i++)
			if(X[i]==0)
				return false;
		return true;
	}	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n: ");
			int n=sc.nextInt();
			int[][] arr=new int[n][n];
			System.out.println("Enter matrix column wise: ");
			for(int j=0;j<n;j++) {
				for(int i=0;i<n;i++) {
					arr[i][j]=sc.nextInt();
				}
				System.out.println();
			}
//			int n=4;
//			 int arr[][] =
//				  { { 1, 2, 3, 4 },
//	                 { 2, 4, 4, 3 },
//	                 { 3, 4, 2, 2 },
//	                 { 4, 3, 2, 3 } };
			
			int X[]=new int[n+1];
			boolean check=false;
			
			for(int i=0;i<arr.length;i++)
			{
				Arrays.fill(X, 0);
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i][j]>n || arr[i][j]<=0) {check=true;break;}
					X[arr[i][j]]+=1;
				}
				if(!check(X)) check=true;
				if(check)break;
				
			}
			
			if(check)System.out.println("Not Latin  yha pe");
			
			
			for(int j=0;j<arr.length;j++)
			{
				Arrays.fill(X, 0);
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i][j]>n || arr[i][j]<=0) {check=true;break;}
					X[arr[i][j]]+=1;
				}
				if(!check(X)) check=true;
				if(check)break;
			}
			
			if(check)System.out.println("Not Latin");
			else {
				System.out.println("Haan Mai latin hu pr diagonal ka check krlo bhai");
			}
			
			Arrays.fill(X, 0);
			for(int i=0;i<n;i++)
			{
				System.out.println(i+"  "+arr[i][i]);
				X[arr[i][i]]+=1;
			}
			System.out.println(Arrays.toString(X));
			if(!check(X)) System.out.println("sorry mai trans nhi hu");
			else {
				System.out.println("Hurray.. Mai to trans nikla");
			}			 
		sc.close();
		}
		

}