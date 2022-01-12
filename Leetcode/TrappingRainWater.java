import java.util.*;
public class TrappingRainWater {
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
    public static int trap(int[] height) {
        if(height.length<3)return 0;
        
        ArrayList<Integer> prefix = new ArrayList<>();
        ArrayList<Integer> suffix = new ArrayList<>();
        int leftMax = 0,rightMax=0;
        
        for(int i=0;i<height.length;i++){
            if(height[i]>=leftMax) {
            	prefix.add(height[i]);
            	leftMax=height[i];
            }
            else prefix.add(leftMax);
        }        
        System.out.println(prefix);
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=rightMax) {
            	suffix.add(height[i]);
            	rightMax=height[i];
            }
            else suffix.add(rightMax);
        }
        Collections.reverse(suffix);
        System.out.println(suffix);
        int ans=0;
        for(int i=1;i<height.length-1;i++){
            int waterLevel=Math.min(prefix.get(i),suffix.get(i));
            ans+=(waterLevel-height[i]);    
        }
        return ans;

	}
}
