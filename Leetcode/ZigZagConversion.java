import java.util.*;
public class ZigZagConversion {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str=zigzag("PAYPALISHIRING",4);
			System.out.println(str);

		}
		public static String zigzag(String A, int B) {
	        String a[]=new String[B];
	        
	        int j=0;
	        int dir=1;
	        if(B==0||B==1||B>=A.length())
	        return A;
	        
	        for(int i=0;i<A.length();i++)
	        {
	            a[j]=a[j]+A.charAt(i);
	            System.out.println(Arrays.toString(a));
	            if(dir==1)
	            j++;
	            else
	            j--;
	            
	            if(j==B-1)
	            dir=0;
	            
	            
	            if(j==0)
	            dir=1;
	            
	        }
	        String s=new String();
	        for(int i=0;i<B;i++)
	        s=s+a[i].substring(4).trim();
	        
	        return s;
	    }
	}


//    public static String convert(String s, int numRows) {
//    	if(numRows == 1)
//            return s;
//        List<StringBuilder> sb = new ArrayList<>();
//        int min = Math.min(numRows, s.length());
//        boolean dir = false;
//        int currRow = 0;
//        for(int i=0; i<min; i++)
//        {
//            sb.add(new StringBuilder());
//        }
//        for(char c : s.toCharArray())
//        {
//            sb.get(currRow).append(c);
//            if(currRow == 0 || currRow == numRows-1)
//                dir = !dir;
//            int val = dir ? 1 : -1;
//            currRow = currRow + val;
//        }
//        
//        StringBuilder res = new StringBuilder();
//        for(int i=0; i<sb.size(); i++)
//        {
//            res.append(sb.get(i));
//        }
//        
//        return res.toString();
//    	 if(numRows==1)return s;
//    	 Map<Integer, StringBuilder> map = new HashMap();
//         boolean increment = true;
//         int pos = 0;
//         for (char c: s.toCharArray()){
//             if (pos == numRows)
//                 increment = false;
//             if (pos == 1)
//                 increment = true;
//             if (increment)
//                 pos += 1;
//             else
//                 pos -= 1;
//             while(!map.containsKey(pos)){
//                 map.put(pos, new StringBuilder());
//             }
//             map.get(pos).append(c);
//         }
//         StringBuilder result = new StringBuilder();
//         for (int index: map.keySet()){
//             result.append(map.get(index));
//         }
//         return result.toString();
//    	 Map<Integer, StringBuilder> arr = new HashMap();
//	        //  for(int a=0; a<arr.length;a++)
//	        //	arr[a]="";
//	       
//	        int row=1, direction=1;//1 for down 0 for up
//	        for(int index=0; index<numRows;index++){
//                arr.put(row, new StringBuilder());
//            }
//	        for(int i=0; i<s.length(); i++) {
//	        	if(row==0){
//	        		arr.get(row).append(s.charAt(i));
//	        		if(direction==1)row++;
//	        		else if(direction==0) {
//	        			direction=1;
//	        			row++;
//	        		}
//	        	}
//	        	else if(row==numRows-1 ) {
//	        		arr.get(row).append(s.charAt(i));
//                 if(direction==0)row--;
//	        		else if(direction==1) {
//	        			direction=0;
//	        			row--;
//	        		}
//	        	}
//	        	else if(direction==1) {
//	        		arr.get(row).append(s.charAt(i));
//                 row++;
//	        	}
//	        	else if(direction==0){
//	        		arr.get(row).append(s.charAt(i));
//                 row--;
//             }
//	        	
//	           
//	        	
//	        }
//	        // String res="";
//	        // for(int a=0; a<arr.length;a++)
//	        // 	res=res+arr[a];
//	        StringBuilder result = new StringBuilder();
//	        for (int index: arr.keySet()){
//	            result.append(arr.get(index));
//	        }
//	        return result.toString();
//	    
//	        
//	//        return ret.toString();   
//    	
    	 //MY STRING SOLUTION
    	 
//	        if(numRows==1)return s;
//	        
//	        String[] arr=new String[numRows];
//	        for(int a=0; a<arr.length;a++)
//	        	arr[a]="";
//	        //String str="";
//	        int row=0, direction=1;//1 for down 0 for up
//	        for(int i=0; i<s.length(); i++) {
//	        	if(row==0){
//	        		arr[row]=arr[row]+s.charAt(i);
//	        		if(direction==1)row++;
//	        		else if(direction==0) {
//	        			direction=1;
//	        			row++;
//	        		}
//	        	}
//	        	else if(row==numRows-1 ) {
//	        		arr[row]=arr[row]+s.charAt(i);	        		
//     				if(direction==0)row--;
//	        		else if(direction==1) {
//	        			direction=0;
//	        			row--;
//	        		}
//	        	}
//	        	else if(direction==1) {
//	        		arr[row]=arr[row]+s.charAt(i);	        		
//     				row++;
//	        	}
//	        	else if(direction==0){
//	        		arr[row]=arr[row]+s.charAt(i);	        		
//     				row--;
//	        	}
//	        	
//	        	//System.out.println(arr[row]);
//	        	
//	        }
//	        String res="";
//	        for(int a=0; a<arr.length;a++)
//	        	res=res+arr[a];
//	        
//	        return res;
//     }
//}
