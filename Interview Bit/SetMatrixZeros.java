import java.util.*;
public class SetMatrixZeros {
	public static void main(String args[]) {
		int[][] A={{1,1,1},{1,0,1},{1,1,1}};
		int[][] result=solve(A);
		for(int i=0 ; i<result.length;i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		 
		
	}
	
	private static int[][] solve(int[][] A) {
		ArrayList<Integer> rownum=new ArrayList<Integer>();
		ArrayList<Integer> colnum=new ArrayList<Integer>();
		//int n=0;
		for(int i=0; i<A.length; i++) 
			for (int j = 0; j < A[0].length; j++) 
				if(A[i][j]==0) {
					rownum.add(i);
					colnum.add(j);
					//n++;
				}
			
		for (int j = 0; j < rownum.size(); j++) {
			System.out.print(rownum.get(j)+" ");
		}
		System.out.println();
		for (int j = 0; j < colnum.size(); j++) {
			System.out.print(colnum.get(j)+" ");
		}
		System.out.println();
		
		// Make row zero
		int n=0;
		while(n<rownum.size()) {
			int i=rownum.get(n);
			for (int j = 0; j < A[0].length; j++) {
		          A[i][j]=0;
		        }
//	    	for (int j = 0; j < A.length; j++) {
//				System.out.print(A[i][j]+" ");
//			}
	    	n++;
	    }
		
	    // Make col zero
	    n=0;
		while(n<colnum.size()) {
			int i=colnum.get(n);
			for (int j = 0; j < A[0].length; j++) {
		          A[j][i]=0;
		        }
//	    	for (int j = 0; j < A.length; j++) {
//				System.out.print(A[i][j]+" ");
//			}
	    	n++;
	    }
//	    for (int i = colnum.get(0); i < colnum.get(colnum.size()-1); i=colnum.get(n)) {
//	    	for (int j = 0; j < A.length; j++) {
//		          A[j][i]=0;
//		        }
//	    	n++;
//	    }
	    return A;
		
	}

}
