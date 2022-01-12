import java.util.*;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Max1sAfterModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {1, 0, 0, 1, 1, 1, 1};
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(a));
		
		int B= 1;
		System.out.println(solve(l,B));
		
	}
	 public static int solve(ArrayList<Integer> A, int B) {
	        int n=A.size();
	        int l=0, count=0;
	        int ans=Integer.MIN_VALUE;
	     for(int i=0;i<n;i++){ 
	         if(A.get(i)==0){
	            count++;
	        }
	        while(count>B){
	            if(A.get(l)==0)count--;
	            l++;
	        }
	        ans=Math.max(ans, i-l+1);
	    }
	    return ans;
	    }
}
