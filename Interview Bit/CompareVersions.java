import java.util.*;
public class CompareVersions {

	public static void main(String[] args) {
		String A = "444444444444444444444444";
		String B = "4444444444444444444444444";
		System.out.println(compareVersion(A,B));
	}
	
	public static int compareVersion(String A, String B) {
        ArrayList<String>s1=new ArrayList<>(Arrays.asList(A.split("[.]")));
        ArrayList<String>s2=new ArrayList<>(Arrays.asList(B.split("[.]")));
        System.out.println(s1);

        while(s1.size() > s2.size()) s2.add("0");
        System.out.println(s2);
        
        while(s1.size() < s2.size()) s1.add("0");
        System.out.println("hii");
        System.out.println(s1.size()+" "+ s2.size());
        for(int i=0;i<Math.min(s1.size(),s2.size());i++){
            double a = Double.parseDouble(s1.get(i));
            double b = Double.parseDouble(s2.get(i));
                
            if(a>b)return 1;
            else if(b>a)return -1;
        }
        return 0;
    }
}
