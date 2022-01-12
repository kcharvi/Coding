import java.util.*;
public class RestoreIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "25525511135";
		//Output: ["255.255.11.135","255.255.111.35"]
		List<String> res= restoreIpAddresses(s);
		System.out.println(res);
	}
	 public static List<String> restoreIpAddresses(String s) {
	        List<String> ip =new ArrayList<>();
	        if(s.length()<4  || s.length()>12)return null;
	        
	        
	        
			return ip;
	        
	    }

}
