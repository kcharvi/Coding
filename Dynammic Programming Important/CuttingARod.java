
public class CuttingARod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
	        int size = arr.length;
	        System.out.println("Maximum Obtainable Value is " +
	                            cutRod(arr, size));
	}

	private static int cutRod(int[] arr, int n) {
		// TODO Auto-generated method stub
		int val[] = new int[n+1];
		val[0]=0;
		for (int i = 1; i <= n; i++) {
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < i; j++) {
				
				max=Math.max(max,arr[j]+val[i-j-1]);
			}
			val[i]=max;
			for (int k = 0; k < val.length; k++) {
				System.out.print(val[k]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i]+" ");
		}
		System.out.println();
		return val[n];
	}

}
