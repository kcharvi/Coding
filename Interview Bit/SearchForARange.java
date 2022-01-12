import java.util.*;
public class SearchForARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A= {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		//int[] A= {1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10};
		int[] A= { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10 };
		int B=1;
		int[] result=searchRange(A,B);
		System.out.println(Arrays.toString(result));
	}
	 public static int[] searchRange(final int[] A, int B) {
	        
	        int[] result=new int[2];
	        Arrays.fill(result,-1);
	        if(A.length<2 && A[0]==B)return new int[]{0,0};
	        int l=0,r=A.length-1;
	        int mid=l+(r-l)/2;
	        while(l<=r){
	            mid=l+(r-l)/2;
	            if(A[mid]==B){
	                result[0]=searchleft(mid,A,B);
	                result[1]=searchright(mid,A,B);
	                break;
	            }
	            if(A[mid]<B)l=mid+1;
	            else r=mid-1;
	        }
	        return result;
	    }
	 public static searching(int L, int )
//	    public static int searchleft(int index,int[] A,int B){
//	        while(A[index]==B&&index>=0)index--;
//	        return index+1;
//	    }
//	    public static int searchright(int index,int[] A,int B){
//	        while(A[index]==B && index<A.length-1)index++;
//	        return index;
	    }
}
