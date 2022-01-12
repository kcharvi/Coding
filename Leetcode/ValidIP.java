import java.util.*;

public class ValidIP {
	public static void main(String[] args) {
		String IP= "192.0.0.1" ;//"172.16.254.1"; //"IPv4"
		//"2001:0db8:85a3:0:0:8A2E:0370:7334" "IPv6"
		//"256.256.256.256"  neither
		//"2001:0db8:85a3:0:0:8A2E:0370:7334"  IPv6		
		//"2001:0db8:85a3:0:0:8A2E:0370:7334:" neither
		//"1e1.4.5.6"   neither
		// "1.1.1.1."   neither
		// "00.0.0.0"   neither
		//"192.0.0.1" IPv4
		System.out.println(validIPAddress(IP));
	}
	public static String validIPAddress(String IP) {

		String result="";
        if(IP.contains(".")){
            result=checkIPv4(IP);
        }else{
            result=checkIPv6(IP);
        }
        return result=="" ? "Neither" : result;
    }
       public static String checkIPv4(String IP){    
    	  if(IP.endsWith(".")||IP.length()>15)return "";
          String arr[]= IP.split("\\.");
          if(arr.length!=4)return "";                    
                    
          for(String i : arr){
                try {
        		   if(Integer.parseInt(i)==0 && i.length()!=1) return "";
                   if(i.length()>3 || (Integer.parseInt(i)!=0 && i.startsWith("0")) 
                      || i.length()==0) return "";
                   
                   int val= Integer.parseInt(i);
                   if(val<0 || val>255)return "";
              }catch(Exception e) {return "";}
            }
            return "IPv4";
        }
    public static String checkIPv6(String IP){    
    		if(IP.endsWith(":") || IP.length()>39)return "";
            IP=IP.toUpperCase();
            String arr[]= IP.split(":");
            if(arr.length!=8)return "";                    
           
           for(String i : arr){
                 if(i.length()>4 || i.length()==0)return "";
                 String res=checkHex(i);
                 if(res=="")return "";
            }
            return "IPv6";
        }
    public static String checkHex(String S){
        int n = S.length();
        for (int i = 0; i < n; i++) {
             char ch = S.charAt(i);
                if ((ch < '0' || ch > '9')
                && (ch < 'A' || ch > 'F')) {
                return "";
            }
        }
        return "Hex";
    }
	
}