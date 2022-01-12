import java.util.Arrays;

public class TripletsWithSumBetwnGivenRange {
	public static void main(String[] args) {
		String[] str= { "0.002804", "0.000298", "0.748024", "0.139023", "0.082317", 
				"0.013348", "4.209490", "0.098512", "0.055635", "0.060427", "3.290499",
				"0.073212", "0.071914", "0.065654", "0.044422", "0.024968", "0.110226", 
				"0.090197", "0.060240", "0.100432", "0.109920", "0.023673", "0.081927", 
				"0.066987", "0.058557", "0.043674", "0.057256", "0.050478", "0.024976",
				"0.048124", "0.071043", "0.048199", "0.023894", "0.058934", "0.047465", 
				"0.088664", "0.002571", "0.070546", "0.042776" };
		System.out.println(solve(str));
		}
	public static int solve(String[] A) {
//        int a = 0, b = 1, c=2;
//        
//        if(A.length==3){
//            float sum = Float.parseFloat(A[a]) + Float.parseFloat(A[b])+ Float.parseFloat(A[c]);
//            if(sum>1 &&sum<2) {
//                return 1;
//            }
//            else
//               return 0;
//        }
//           
//        while(c<A.length){
//            
//            float sum = Float.parseFloat(A[a]) + Float.parseFloat(A[b])+ Float.parseFloat(A[c]);
//            
//            if(sum>1 && sum<2 && a!=b && b!=c && a!=c) {
//                System.out.println(a);
//                System.out.println(b);
//                System.out.println(c);
//                System.out.println(sum);                
//            	return 1;
//            }
//                
//                        
//            if((a+1) == b && (a+2)== c) {
//                a += 3;
//            }
//            else {
//                if((b+1) == c){
//                    b+=2;
//                }
//                else{
//                      b+=1;
//                    }
//                a += 1;
//            }
//            
//           if(a > A.length-1 || b>A.length-1) {
//                a = 0;
//                if(b>A.length-1)
//                     b=0;
//                c++;
//            }
//                      
//        }
//        return 0;
		float a[] = new float[A.length];
        for(int i =0; i<A.length; i++){
            a[i]=Float.parseFloat(A[i]);
        }
       Arrays.sort(a);
       int first = 0,middle=1,last=A.length-1;
       while(last>first && last>middle) {
       
           float sum = a[first] + a[middle] + a[last];
           if (sum>1 && sum<2) 
               return 1; 
           else if(sum>2)
               last = last-1; 
           else if(sum<1)
               middle = middle + 1; 
       
           if(middle==A.length-1){
               first = first + 1 ;
               middle = first + 1 ;
               last = A.length-1;
           }
           
       }    
       
       return 0;
        }   
    }

