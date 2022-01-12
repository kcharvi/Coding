import java.util.*;
public class SpiralOrderMatrix {
public static void main(String[] args) {
	int A=15;
	ArrayList<ArrayList<Integer>> res= solve(A);
	for(int i=0;i<res.size();i++) {
		for(int j=0;j<res.size();j++)
            System.out.print(res.get(i).get(j)+" ");
		System.out.println();
    }
}
public static ArrayList<ArrayList<Integer>> solve(int A) {
	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	
	//Creating a 2D list and adding -1
	for(int i=0;i<A;i++)
	{
		ArrayList<Integer> list=new ArrayList<Integer>(A);
		for (int j = 0; j < A; j++) {
		    list.add(-1);	
		}
		res.add(list);
	}
	
	//For the 4 directions, 4 diff if else cases.
	int row=0, col=0, side=A-1, down=A-1, dir=1, number=01;
	
	while(row<=side+1 && col<=down+1) {
		//going towards right
		if(dir==1) {
			ArrayList<Integer> temp=res.get(row);
			for (int i = col; i <= side; i++) {
				temp.set(i,number++);				
			}
			row++;
			dir=2;
		}
		
		//going toward down
		else if(dir==2) {
			//ArrayList<Integer> temp=res.get(side);
			for (int i = row; i <= down; i++) {
				ArrayList<Integer> temp=res.get(i);
				temp.set(side,number++);
				
			}
			side--;
			dir=3;
		}
		
		//going towards left
		else if(dir==3) {
			ArrayList<Integer> temp=res.get(down);
			for (int i = side; i >= col; i--) {
				temp.set(i,number++);				
			}
			down--;
			dir=4;
		}
		
		//going towards up
		else if(dir==4) {
			//ArrayList<Integer> temp=res.get(col);
			for (int i = down; i >= row; i--) {
				ArrayList<Integer> temp=res.get(i);
				temp.set(col,number++);		
				
			}
			col++;
			dir=1;
		}
	}
	
	return res;
	
}
}
