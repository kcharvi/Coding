import java.util.*;
import java.util.ArrayList; 
public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result=solve(7);
		System.out.println(result);

	}
//	 public static ArrayList<ArrayList<Integer>> solve(int A) {
//	        if (A == 0) 
//	          return new ArrayList<ArrayList<Integer>>();
//	        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
//	        find(A, res);
//	        return res;
//	    }
//	    
//	    public static void find(int A, ArrayList<ArrayList<Integer>> res) {
//	        if (A == 1) {
//	            res.add(new ArrayList<Integer>(Arrays.asList(1)));
//	            //System.out.println(res);
//	        } 
//	        else {
//	        	System.out.println(res);
//	            find(A - 1, res);
//	            //System.out.println(res);
//	            ArrayList<Integer> prev = res.get(res.size() - 1);
//	            ArrayList<Integer> cur = new ArrayList<Integer>();
//	            cur.add(prev.get(0));
//	        	System.out.println(res);
//	            for (int i = 1; i < prev.size(); i++) {
//	                cur.add(prev.get(i - 1) + prev.get(i));
//	            }
//	            cur.add(prev.get(prev.size() - 1));
//	            res.add(cur);
//	        }
	 
	public static ArrayList<ArrayList<Integer>> solve(int A)
	 { 
	 // An auxiliary array to store generated pascal triangle values 
	 //int[][] arr = new int[n][n];  
	 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 // Iterate through every line and print integer(s) in it 
	 for (int line = 0; line < A; line++) 
	 { 
	     // Every line has number of integers equal to line number 
	     for (int i = 0; i <= line; i++) 
	     { 
	     // First and last values in every row are 1 
	     if (line == i || i == 0) 
	         result.get(line).get(i).add(1); 
	     else // Other values are sum of values just above and left of above 
	    	 result.get(line).get(i).add(result.get(line-1).get(i-1)+result.get(line-1).get(i)); 
	     //System.out.print(arr[line][i]); 
	     } 
	     //System.out.println(""); 
	 } 
	 return result;
	 } 
}


