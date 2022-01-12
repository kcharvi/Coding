
public class Prims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=9;
		int[][] graph= {{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },
						{ 4, 0, 8, 0, 0, 0, 0, 11,0 },
						{ 0, 8, 0, 7, 0, 4, 0, 0, 2 },
						{ 0, 0, 7, 0, 9, 14,0, 0, 0 },
						{ 0, 0, 0, 9, 0, 10,0, 0, 0 },
						{ 0, 0, 4, 14,10,0, 2, 0, 0 },
						{ 0, 0, 0, 0, 0, 2, 0, 1, 6 },
						{ 8, 11,0, 0, 0, 0, 1, 0, 7 },
						{ 0, 0, 2, 0, 0, 0, 6, 7, 0 },
						};
		prims(graph,v);
	}
	public static void prims(int[][] graph,int V) {
		int root[] = new int[V];
		int key[] = new int[V];
		Boolean visited[] = new Boolean[V];
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		key[0]=0;
		root[0]=-1;
		for (int i = 0; i < V - 1; i++) {
			int x = minKey(key, visited, V);
			visited[x] = true;
			for (int j = 0; j < V; j++)
				if (graph[x][j] != 0 && visited[j] == false && graph[x][j] < key[j]) {
					root[j] = x;
					key[j] = graph[x][j];
				}
		}
		
		int minSum=0;
		for(int i=1;i<V;i++)
			minSum+=graph[i][root[i]];
		
		System.out.println(minSum);


	}
	public static int minKey(int[] key, Boolean[] visited,int V) {
			int min = Integer.MAX_VALUE, min_index = -1;
			for (int v = 0; v < V; v++)
				if (visited[v] == false && key[v] < min) {
					min = key[v];
					min_index = v;
				}
			return min_index;
		
	}
}


//for (int i = 1; i < V; i++)
//System.out.println(root[i] + " - " + i + "\t" + graph[i][root[i]]);
