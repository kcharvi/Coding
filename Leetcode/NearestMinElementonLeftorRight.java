import java.util.Stack;
	public class NearestMinElementonLeftorRight {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a= {1,6, 4,10,2, 5};
			minElementLeft(a);
			System.out.println();
			minElementRight(a);
		}
		public static void minElementLeft(int[] arr){
			Stack<Integer> s = new Stack<>();
			for(int i=0; i<arr.length;i++) {
				while(!s.empty() && s.peek()>=arr[i])
					s.pop();
				if(s.empty())System.out.print(-1+" ");
				else System.out.print(s.peek()+" ");
				
				s.push(arr[i]);
			}			
		}
		
		public static void minElementRight(int[] arr){
			Stack<Integer> s = new Stack<>();
			for(int i=0; i<arr.length;i++) {
				while(!s.empty() && s.peek()<=arr[i])
					s.pop();
				if(s.empty())System.out.print(-1+" ");
				else System.out.print(s.peek()+" ");
				
				s.push(arr[i]);
			}
		}
	}