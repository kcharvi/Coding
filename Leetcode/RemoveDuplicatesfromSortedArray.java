//import java.util.Arrays;
//
//public class RemoveDuplicatesfromSortedArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums= {0,0,1,1,1,2,2,3,3,4};
//		int res=removeDuplicates(nums);
//		System.out.println(res);
//		System.out.println(Arrays.toString(nums));
//	}
//	
//	public static int removeDuplicates(int[] nums) {
////        int res=0;
////        for(int i=0;i<nums.length-1; i++){
////            if(nums[i]==nums[i+1]){
////                res++;
////                shift(nums, i);
////            }
////        }
////        return res;
////    }
////    
////    public static void shift(int[] nums, int i){
////        for(int j=i; j<nums.length-1;j++){
////        	System.out.print(nums[j]+" ");
////            nums[j]=nums[j+1];
////        }
//		if (nums.length == 0) 
//			return 0;
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//        	if (nums[j] != nums[i]) {
//            	System.out.println(nums[i] );
//            	nums[++i] = nums[j];
//        	}
//        }
//        return i + 1;
//        
//    }
//	
//	public class Solution {
//	    public int searchMatrix(int[][] A, int B) {
//	        // int get=0;
//	        // for(int i=0; i<A.length; i++){
//	        //     if(B>A[i][A[i].length])
//	        //       i++;
//	        //     else{
//	        //         int l=A[i][0];
//	        //         int r=A[i][A[i].length];
//	        //         while(l<r){
//	        //               int mid=l+r/2;
//	        //               get = Arrays.binarySearch(A[i],mid);
//	                      
//	        //               if(get==-1)
//	        //                  return 0;
//	        //               if (B > A[i][get]) 
//	        //                   l = mid + 1; 
//	        //               else
//	        //                   r = mid;
//	        //           }
//	        //     }
//	        // }
//	        // return 1;
//	        
//	        int n = A.size(); int m = A.get(0).size();
//	        int j = m-1;
//	        for(int i=0; i<n; i++){
//	            int p = A.get(i).get(j);
//	            if(p > B){
//	                while(p > B && j>=0){
//	                    p = A.get(i).get(j);
//	                    j--;
//	                    if(p == B){
//	                        return 1;
//	                    }
//	                }
//	                return 0;
//	            }
//	            else if(p==B){
//	                return 1;
//	            }
//	        }
//	        return 0;
//	    }
//	}
//
//
//}
