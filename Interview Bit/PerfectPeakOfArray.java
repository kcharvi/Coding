
public class PerfectPeakOfArray {

	public static void main(String[] args) {
		int[] a= {5, 1, 4, 3, 6, 8, 10, 7, 9 };
		System.out.println(solve(a));
	}
	
	public static int solve(int[] A) {
	    int n = A.length;
		
		for(int i = 1; i < n - 1; i++) {
			int temp = A[i];
			int k = i - 1;
			int j = i + 1;
			while(true) {
				if(k >= 0 && A[k] < temp) {
					k--;
				}
				if(j < n && A[j] > temp) {
					j++;
				}
				if( (k >= 0 && A[k] >= temp) || ( j < n && A[j] <= temp)) break;
				if( k < 0 && j >= n) {
				// 	System.out.println("The peak element is: " + temp);
					return 1;
				}
			}
		}
		
		return 0;
	   }

}
