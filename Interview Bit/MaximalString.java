import java.util.*;
import java.util.Collections;
public class MaximalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("2546791",4));
	}
	public static char[] temp;
    static String ans="";
    public static String solve(String A, int B) {
    	char[] arr = A.toCharArray();
    	temp =arr;
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        for (int i=0; i < (temp.length/2); i++)
        {
            char l = temp[i];
            temp[i] = temp[temp.length-i-1];
            temp[temp.length-i-1] = l;
        }
        System.out.println(Arrays.toString(temp));
//        helper(arr ,0, B);
        int i=0;
        while(B>0) {
        	if(i>=arr.length-1)break;
        	swap(arr,arr[i],temp[i]);
        	i++;
        }
        String res=Arrays.toString(arr);
        return res;
    }
    public static void helper(char[] arr, int i, int B){
        if(i==arr.length-1 && B<1)return;
        if(B!=0){
            swap(arr,arr[i],temp[i]);
            ans+=arr[i];
            helper(arr,i+1,B--);
        }
    }
    
    
    public static void swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}