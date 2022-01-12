import java.util.*;
public class HotelRoomBookings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		Integer Arr[]= {9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27};
		Collections.addAll(A,Arr);
		ArrayList<Integer> B = new ArrayList<>();
		Integer Brr[]= {32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38};
		Collections.addAll(B,Brr);
		int C = 16;
		System.out.println(hotel(A, B,C));
	}
	
	    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
////	        if(arrive.size()<K)return true;
////	        
////	        int a=1 , d=0;
////	        int cnt=1;
////	        while(a<arrive.size()&&d<depart.size()){
////	            if(arrive.get(a)<depart.get(d))cnt++;
////	            a++;
////	            d++;
////	            if(cnt>K)return false;
////	        }
////	        return true;
//	    	System.out.println(arrive.size());
//	         Collections.sort(arrive);
//	         System.out.println(arrive);
//	 		Collections.sort(depart);
//	 		System.out.println(depart);
//	 		for (int i = 0; i < arrive.size(); i++) {
//	 			System.out.println(i+K+" "+" "+depart.get(i));
//	 			if (i + K < arrive.size() && arrive.get(i + K) < depart.get(i))
//	 				return false;
//	 		}
//	 		return true;
//	    	if(arrive==null || depart==null)return false;
//	    	
//	    	Collections.sort(arrive);
//	    	Collections.sort(depart);
//	    	for(int i=0; i<arrive.size(); i++) {
//	    		if(arrive.get(i)>depart.get(0))depart.remove(0);
//	    	}
//	    	return depart.size()<=K?true:false;
	    	
	    	if (arrive.size() != depart.size() || K == 0 && arrive.size() > 0) {
	            return false;
	        }
	        Collections.sort(arrive);
	        Collections.sort(depart);

	        int i = 0, j = 0, counter = 0, max = 0;

	        while (i < arrive.size() && j < depart.size()) {
	            if (arrive.get(i) < depart.get(j)) {
	                counter++;
	                if (counter > max) {
	                    max = counter;
	                }
	                i++;
	            } else {
	                counter--;
	                j++;
	            }
	        }
	        if (max > K) {
	            return false;
	        }

	        return true;
	    }
	


}
