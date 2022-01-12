import java.util.*;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3, 4, 1, 4, 1 };
		System.out.println(repeatedNumber(a));
	}

	public static int repeatedNumber(final int[] A) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                count = map.get(A[i]);
                map.put(A[i], count + 1);
            }
            else{
                map.put(A[i], 1);
            }
        }
         for(Map.Entry entry : map.entrySet())
        {
            if((int)entry.getValue() > 1){
                return ((int)entry.getKey());
                
            }
        }
        
            return -1;
        
    }
}
