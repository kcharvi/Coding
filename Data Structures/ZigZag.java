import java.util.*;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=zigzag("PAYPALISHIRING",4);
		System.out.println(str);

	}
	public static String zigzag(String A, int B) {
        String a[]=new String[B];
        
        int j=0;
        int dir=1;
        if(B==0||B==1||B>=A.length())
        return A;
        
        for(int i=0;i<A.length();i++)
        {
            a[j]=a[j]+A.charAt(i);
            System.out.println(Arrays.toString(a));
            if(dir==1)
            j++;
            else
            j--;
            
            if(j==B-1)
            dir=0;
            
            
            if(j==0)
            dir=1;
            
        }
        String s=new String();
        for(int i=0;i<B;i++)
        s=s+a[i].substring(4).trim();
        
        return s;
    }
}
