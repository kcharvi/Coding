import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[] = {9,9};
		int[] res= plusOne(digits);
		System.out.println(Arrays.toString(res));
	}
	 public static int[] plusOne(int[] digits) {
		 int i=digits.length-1;
	        if(digits[i]!=9){
	            digits[i]+=1;
	        }
	        else{
	            int last=-1;
	            for(int j=digits.length-1;j>=0;j--){
	                if(digits[j]!=9){
	                    digits[j]+=1;
	                    break;
	                }
	            else{
	               last=j;
	               digits[j]=0;
	            }
	                if(last==0){
	                    int[] inc=new int[digits.length+1];
		        	    //Arrays.fill(inc,0);
		        	    inc[0]=1;
		        	    return inc;
	                }
	            }
	         }
	        return digits;
	        
	    }

}
