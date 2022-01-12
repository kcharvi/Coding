import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,3,5,8,15,28,36,42,44,98};
		int target=13;
		System.out.println(Arrays.toString(twoSum(A,target)));
	}
	      public static int[] twoSum(int[] nums, int target) {
	        // HashMap<Integer,Integer> map=new HashMap<>();
	        // for(int i=0;i<nums.length;i++){
	        //     int remainder=target-nums[i];
	        //     if(map.containsKey(remainder)){
	        //         return new int[]{map.get(remainder),i};
	        //     }
	        //     else{
	        //         map.put(nums[i],i);
	        //     }
	        // }
	        // return new int[]{};
	        int[] res = new int[2];
			int a = 0, b = 1;
	        while(true){
				int sum = nums[a] + nums[b];
				if(sum == target) {
	                res[0] = a;
	                res[1] = b;
	                break;
	            }
	            if((a+1) == b) {
	                a += 2;
	            } else { 
	                a += 1;
	            }
	            if(a > nums.length-1) {
	                a = 0;
	                b++;
	            }
	        }
	        return res;
	        
	        
	        
	        // int[] res= new int[2];
	        // for(int i=0;i<nums.length;i++){
	        //     for(int j=i+1;j<nums.length;j++){
	        //         if(nums[i]+nums[j]==target ){
	        //             res[0]=i;
	        //             res[1]=j;
	        //             return res;
	        //         }
	        //     }
	        // }
	        // return res;
	    }
	}


