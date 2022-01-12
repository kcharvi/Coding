import java.util.*;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(90);
		list.add(84);
		list.add(9);
		arrange(list);
		}
	public static void arrange(ArrayList<Integer> a) {
	    
	    int size = a.size();
	    for (int i = 0; i < size; i++) {
	        int product = (a.get(a.get(i)) % size) * size + a.get(i);
	        a.set(i, product);
	    }

	    for (int i = 0; i < size; i++) {
	        int temp = a.get(i);
	        a.set(i, temp / size);
	    }            
	}
}
