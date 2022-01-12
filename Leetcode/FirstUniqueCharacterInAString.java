import java.util.*;
public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("dddccdbba"));
	}
	 public static int firstUniqChar(String s) {
	        HashSet<Character> set =new HashSet<Character>();
	        Queue<Integer> dq = new ArrayDeque<>();
	        int ans=-1;
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            System.out.println(dq);
	            if(!dq.isEmpty()&&set.contains(ch)&&ch==s.charAt(dq.peek())&& !dq.isEmpty()){
	            	//System.out.println(dq.peek());
	                dq.remove();
	            }
	            else{
	                set.add(ch);
	                dq.add(i);
	            }
	            if(dq.isEmpty())ans=-1;
	            else ans=dq.peek();
	        }
	        return ans;
	    }
}
