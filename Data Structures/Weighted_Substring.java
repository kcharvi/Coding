package Test;
import java.util.*;
public class Weighted_Substring {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(shortestString(n));
	}
	public static String shortestString(int n) {
		String str="";
		HashMap<Character, Integer> map=new HashMap<>();
		ArrayList<Integer> li = new ArrayList();
		for (int i = 4; i < 29; i++) {
			li.add(i*li.get(li.size()-1));
		}
		System.out.println(li);
		
		
		return str;
	}
}


