import java.util.Arrays;

public class MergeSorteArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {2,0};
		int m=1;
		int[] nums2= {1};
		int n=1;
		merge(nums1,m,nums2,n);
	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        if(nums1.length==0 || nums2.length==0)return ;
	        int[] res=new int[m+n];
	        
	        int n1=0,n2=0;
	        for(int i=0;i<res.length;i++){
	            if(n2>=n || (nums1[n1] <= nums2[n2] && n1<m)  ) {
	            	res[i]=nums1[n1];
	            	n1++;
	            }
	            else res[i]=nums2[n2++];
	        }
	        
	         for (int i = 0; i < res.length; i++) {
	            nums1[i] = res[i];
	        }

	        System.out.println(Arrays.toString(nums1));
	    }
}
