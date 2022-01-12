import java.util.*;
public class KruskalsAlgo {
	static int V;
	int[] parent;
    int[] rank;
    public KruskalsAlgo(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int graph[][] = { { 0, 1, 7, 10, 5 },
					  	  { 1, 0, 3, 0, 0 },
		                  { 7, 3, 0, 4, 0 },
		 			      { 10, 0, 4, 0, 2 },
					      { 5, 0, 0, 2, 0 } };
		
		System.out.println(kruskalMST(graph));
		sc.close();
	}
	public int find(int x) {
        while(parent[x] != x){
            parent[x] = parent[parent[x]];
                x = parent[x];
        }
        return x;
    }
	public static int kruskalMST(int A[][]){	    
	    int n = A.length;
	    PriorityQueue<int[]> q = new PriorityQueue<>((a, b) ->(a[2] - b[2]));
	    int[][] p = new int[n*(n - 1)/2][3];
	    int idx = 0;
	    for(int i = 0; i < n; i++){
	        for(int j = i + 1; j < n; j++){
	            p[idx][0] = i;
	            p[idx][1] = j;
	            p[idx][2] = Math.abs(A[i][0] - A[j][0]) + Math.abs(A[i][1] - A[j][1]);
	            q.offer(p[idx]);
	            idx++;
	        }
	    }
	    KruskalsAlgo uf = new KruskalsAlgo(n + 1);
	    int res = 0;
	    int numEdge = 0;
	     while(!q.isEmpty()){
	        int[] a = q.poll();
	        int u = a[0];
	        int v = a[1];
	        int w = a[2];
	        
	        if((uf.find(u) == uf.find(v))) continue;
	        

	        res += w;
	        uf.union(u, v);
	        numEdge++;  
	        if(numEdge >= n - 1) break; 
	        
	    }	    
	    return res;
	}
	public void union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) {
             return;
        }
        if(rank[px] < rank[py]) parent[px] = py;
        else if(rank[px] > rank[py]) parent[py] = px;
        else{
            parent[px] = py;
            rank[py]++;
        }
    }
}

