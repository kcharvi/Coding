import java.util.*;
public class SpiralMatrix {
public static void main(String[] args) {
	//int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int[][] matrix = {{3},{2}};
	List<Integer> res=spiralOrder(matrix);
	for(int j=0;j<res.size();j++)
        System.out.print(res.get(j)+" ");
	System.out.println();
}
public static List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer> res=new ArrayList<Integer>();
          
    int row=0, col=0, side=matrix[0].length-1, down=matrix.length-1, dir=1;	
	while(row<=down && col<=side) {
		//going towards right
		if(dir==1) {
			for (int i = col; i <= side; i++) 
				res.add(matrix[row][i]);				
			row++;
			dir=2;
		}
		
		//going toward down
		else if(dir==2) {
			for (int i = row; i <= down; i++) 
			    res.add(matrix[i][side]);
			side--;
            dir=3;
		}
		
		//going towards left
		else if(dir==3) {
			for (int i = side; i >= col; i--) 
				res.add(matrix[down][i]);				
			down--;
            dir=4;
		}
		
		//going towards up
		else if(dir==4) {
			for (int i = down; i >= row; i--) 
				res.add(matrix[i][col]);		
			col++;
            dir=1;
		}
	}
	
	return res;
    }
}