import java.util.List;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3, 30, 34, 5, 9 };
		System.out.println(largestNumber(a));
	}
	public String largestNumber(final List<Integer> A) {
		for(int i=0;i<A.size();i++) {
			for(int j=i+1;j<A.size();j++) {
				String ans=compare(A[i],A[j]);
			}
		}
	}
	
	

}
//String[] arr = new String[a.size()];
//for (int i = 0; i < a.size(); i++) {
//    arr[i] = String.valueOf(a.get(i));
//}
//
//
//Arrays.sort(arr, new Comparator<String>(){
//    public int compare(String a, String b){
//        return (b+a).compareTo(a+b);
//    }
//});
//
//
//StringBuilder sb = new StringBuilder();
//for(String s: arr){
//    sb.append(s);
//}
//
//if(sb.charAt(0) == '0'){     //check if all zeroes are there
//    return String.valueOf(0);
//}
//
//return sb.toString();   
