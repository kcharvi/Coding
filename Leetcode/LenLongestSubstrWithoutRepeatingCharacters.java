import java.util.Arrays;
import java.util.*;

public class LenLongestSubstrWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	 public static int lengthOfLongestSubstring(String s) {
		 int len=0,i=0,currlen=0;
	       HashMap<Character,Integer> map=new HashMap<>();
	       for(int j=0;j<s.length();j++){
	           char curr=s.charAt(j);
	           if(map.containsKey(curr)&&map.get(curr)>=i){  
	               currlen=j-i;
	               len=Math.max(len,currlen);
				   i = map.get(curr) + 1;
	           }
	           map.put(curr,j);
	           
	       }
			currlen = s.length() - i;
			len = Math.max(len, currlen);
	       return len;
      
//      int len = 0; 
//      int [] arr = new int[256];
//      Arrays.fill(arr, -1);
//      int i = 0;
//      for (int j = 0; j < s.length(); j++) {
//         i = Math.max(i, arr[s.charAt(j)] + 1);
//         len = Math.max(len, j - i + 1);
//         arr[s.charAt(j)] = j;
//      }
//      return len;
      
  }
}