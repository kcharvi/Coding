import java.util.*;
public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l=3;
		System.out.println(reverse(l));
	}
	public static long reverse(long A) {
        String str=Long.toBinaryString(A);
        char[] ch = str.toCharArray();
        List<Character> l = new ArrayList<>();
       // System.out.println(str);
        for (char c : ch)
            l.add(c);
        Collections.reverse(l);
        System.out.println(l);
        
        ListIterator li = l.listIterator();
        while (li.hasNext())
            str=str+li.next();
        //str.reverse();
        //System.out.println(str);
        Long longValue = Long.parseLong(str, 2);
    //     long ret = 0, cnt = 32;
    // while (cnt-- > 0) {
    //     ret = (ret << 1) | (A & 0x1);
    //     A = A >>> 1;
    // }
    //return ret;
    return longValue;
    }
}
