import java.util.Arrays;

class MaxGap {
public static void main(String[] args) {
	int[] A = {1, 10, 5};
	System.out.println(maximumGap(A));
}
public static int maximumGap(final int[] A) {
    Arrays.sort(A);
    if(A.length==1)
       return 0;
    int max=0,diff=0;
    for(int j=0;j<A.length-1;j++){
        diff=A[j+1]-A[j];
        if(max<diff)
          max=diff;
    }
    return max;
}
}
