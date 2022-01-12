
public class GridUniquePaths {
public static void main(String[] args) {
	System.out.println(uniquePaths(2,3));
}
static int count=0;
public static int uniquePaths(int A, int B) {
    if(A <= 1 && B <= 1)
      return ++count;

if(A > 1)
    {
	 System.out.print(A+ " ");
	    System.out.println(B+ " ");
	    uniquePaths(A-1, B);
   }

if(B > 1)
    {
	System.out.print(A+" ");
	System.out.println(B+" ");
	uniquePaths(A, B-1);
}
System.out.println();
return count;
}
}
