import java.util.*;
public class OptimalParenthesesMCM {
static char name;
static void printParenthesis(int i, int j,int n, int[][] bracket){
	if (i == j){
	System.out.print(name++);
	return;
	}
	System.out.print("(");
	printParenthesis(i, bracket[i][j], n, bracket);
	printParenthesis(bracket[i][j] + 1, j, n, bracket);
	System.out.print(")");
}
static void matrixChainOrder(int p[], int n){
	int[][] m = new int[n][n];
	int[][] bracket = new int[n][n];
	for (int i = 1; i < n; i++)
		m[i][i] = 0;

	for (int L = 2; L < n; L++){
		for (int i = 1; i < n - L + 1; i++){
			int j = i + L - 1;
			m[i][j] = Integer.MAX_VALUE;
			for (int k = i; k <= j - 1; k++){
				int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
				if (q < m[i][j]){
					m[i][j] = q;
					bracket[i][j] = k;
				}
			}
		}
	}
	name = 'A';
	System.out.print("Optimal Parenthesization is : ");
	printParenthesis(1, n - 1, n, bracket);
	System.out.print("\nOptimal Cost is : " + m[1][n - 1]);
	System.out.println("\nMatrix: \n");
	printMatrix(m);
	System.out.println();printMatrix(bracket);
}
public static void printMatrix(int[][] m) {
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[0].length; j++) {
			System.out.print(m[i][j]+"     ");
		}
		System.out.println();
	}
}
public static void main(String[] args)
{
	int arr[] = { 15,10,25,15,10 };
	int n = arr.length;
	matrixChainOrder(arr, n);
}
}
