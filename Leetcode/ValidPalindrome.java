
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0P";//"A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}
	
	    public static boolean isPalindrome(String s) {
	            String str="";
	            for(int i=0; i<s.length();i++){
	                int c = (int)s.charAt(i);
	                if((c>=65 && c<=90)|| (c>=97 && c<=122)|| (c>=48 && c<=57))str=str+s.charAt(i);
	            }
	            str=str.toLowerCase();
	            String rev="";
	            int j= str.length()-1;
	            while(j>=0){
	                rev=rev+str.charAt(j);
	                j--;
	            }
	            
	            if(rev.equals(str)) return true;
	            else return false;
	            
	        }
	}

