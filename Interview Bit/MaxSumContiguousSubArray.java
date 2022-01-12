import java.util.*;

public class MaxSumContiguousSubArray {

	public static void main(String args[]) {
		int[] a= {3, 1, 6, 4, 5, 2};
		long res=greatestValueDays(a);
		System.out.println(res);
	}
	
//	public static int solve(int[] A) {
//		int maxs=Integer.MIN_VALUE, m=0;
//		int n=A.length;
//		for(int i=0; i<n; i++) {
//			m=m+A[i];
//			if(m>maxs)maxs=m;
//			if(m<0)m=0;
//		}
//		
//		return maxs;
//	}
	


static long  greatestValueDays(int[] ratings) {
  Arrays.sort(ratings);
  int maxs=Integer.MIN_VALUE, sum=0;
  int index=0;
  List<Integer> list = new ArrayList<>();
  int i;
  for(i=ratings.length-1;i>=0;i--){
     // index=i;
      //prev_sum=sum;
      sum=(sum+ratings[i]);
      System.out.println(sum*ratings[i]+ " "+ maxs*ratings[i]);
      list.add(sum*ratings[i]);
      
//      if((maxs*ratings[i]<sum*ratings[i]))
//         { maxs=sum;
//            index=i;
//         }
  }
return Collections.max(list);
//     int maxs=Integer.MIN_VALUE, m=0;
//		int n=ratings.length;
//     int index=0;
//		for(int i=0; i<n; i++) {
//			m=m+ratings[i];
//			if(m*ratings[i]>maxs*ratings[i]){
//             maxs=m;
//             index=i;
//         }
//			if(m<0)m=0;
//		}
//		
//		return maxs*ratings[index];

}
}