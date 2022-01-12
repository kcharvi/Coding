import java.util.*;
public class RotateMatrix {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		ArrayList<Integer> l3 = new ArrayList<>();
		l3.add(7);
		l3.add(8);
		l3.add(9);
		a.add(l1);
		a.add(l2);
		a.add(l3);
		rotate(a);
		
	}
 public static void rotate(ArrayList<ArrayList<Integer>> a) {
    int n = a.size();	
    Collections.reverse(a);
    System.out.println(a);
    System.out.println();
    for(int i = 1;i<n;i++){
    	System.out.println(a);
    	System.out.println();
    	for(int j = 0;j<i;j++){
    		System.out.println(a);
    		int temp = a.get(i).get(j);
    		a.get(i).set(j,a.get(j).get(i)) ;
    		a.get(j).set(i,temp);
    	}
    }
  }
    
}
