import java.util.*;
public class ThreeSum {
public static void main(String[] args) {
	int[] nums = {-1,0,1,2,-1,-4};
	List<List<Integer>> res=threeSum(nums);
	System.out.println(Arrays.toString(res.toArray()));			
	}

	 public static List<List<Integer>> threeSum(int[] nums) {
	        
	        if(nums.length<3)
	            return new ArrayList<>();
	        
	        Arrays.sort(nums);
	        List<List<Integer>> result=  new ArrayList<>();
	        for(int i=0; i < nums.length; i++){
	            if(i>0 && nums[i]==nums[i-1])
	                continue;
	            int left=i+1, right=nums.length-1;
	            
	            while(left<right){
	                int sum=nums[left] + nums[i] + nums[right];
	                if(sum==0){
	                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
	                    right--;
	                    left++;
	                    
	                     while(left<nums.length && nums[left]==nums[left-1])
	                       left++;
	                     while(right>=0 && nums[right]==nums[right+1])
	                       right--;
	    
	                }
	                else if(sum<0)left++;
	                else right--;
	            }
	            
	        }
	        return result;
	       
	    }
}
