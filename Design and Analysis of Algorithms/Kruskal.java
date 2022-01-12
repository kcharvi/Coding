import java.util.*;
/*
 * EXAMPLE GRAPH
 * V=5, E=7
 *  (A-B-1)  0 1 1 
 *  (B-C-3)  1 2 3
 *  (A-C-7)  0 2 7
 *  (C-D-4)  2 3 4
 *  (A-D-10) 0 3 10
 *  (A-E-5)  0 4 5
 *  (E-D-2)  4 3 2
 */


class Kruskal {
	static int V, E;
	Graph edge[];
	
	//Constructor to create the graph
	Kruskal() {
	    edge = new Graph[E];
	    for (int i = 0; i < E; ++i)
	      edge[i] = new Graph();
	  }
	
	//MAIN METHOD
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of Vertices");
	    V = sc.nextInt();
	    System.out.println("Enter the number of Edges");
	    E = sc.nextInt();
	    
	    Kruskal G = new Kruskal();
	    
	    for(int i=0;i<E;i++) {
	    	System.out.println("Enter the src, dst, weight for "+ 
	    				(i)+ " Edge(0-based index): ");
	    	G.edge[i].s = sc.nextInt();
	        G.edge[i].d = sc.nextInt();
	        G.edge[i].w = sc.nextInt();
	    }
	    G.KruskalAlgo();
	    sc.close();
	  }
	
	// Applying Kruskal's Algorithm steps:
	public void KruskalAlgo() {
		Graph result[] = new Graph[V];
	    int e = 0;
	    int i = 0;
	    for (i = 0; i < V; ++i)
	      result[i] = new Graph();

	    //Sorting the edges
	    Arrays.sort(edge);
	    
	    //Creation of subset: Parent will be the vertex and rank initialized to 0
	    subset subsets[] = new subset[V];	    
	    for (i = 0; i < V; ++i)
	      subsets[i] = new subset();
	    for (int v = 0; v < V; ++v) {
	      subsets[v].parent = v;
	      subsets[v].rank = 0;
	    }
	    
	    //Until the number of edges added to our MST is (V-1)
	    //we check if the current edge forms a cycle?
	    //No:  INCLUDE TO MST
	    //Yes: EXCLUDE 
	    i = 0;
	    while (e < V - 1) {
	      Graph next_edge = new Graph();
	      next_edge = edge[i++];
	      //Checking cycle by taking source vertex's subset and 
	      //destination vertex's subset using find() function
	      int x = find(subsets, next_edge.s);
	      int y = find(subsets, next_edge.d);
	      //Not equal then add edge b/w s and d
	      if (x != y) {
	        result[e++] = next_edge;
	        Union(subsets, x, y);
	      }
	    }
	    
	    //Output
	    int mst=0;
	    System.out.println("The MST is: ");
	    for (i = 0; i < e; ++i) {
	       System.out.println(result[i].s + " - " 
	    		  + result[i].d + ": " + result[i].w);
	       mst+=result[i].w;
	    }
	    
	    System.out.println("Total Distance = "+ mst);
	  }
	
	//FindSet return the subset of a vertex	
	public int find(subset subsets[], int i) {
	    if (subsets[i].parent != i)
	      subsets[i].parent = find(subsets, subsets[i].parent);
	    return subsets[i].parent;
    }
	
	//Joining the subsets and updating the parent	
	public void Union(subset subsets[], int x, int y) {
	    int xroot = find(subsets, x);
	    int yroot = find(subsets, y);
	    if (subsets[xroot].rank < subsets[yroot].rank)
	      subsets[xroot].parent = yroot;
	    else if (subsets[xroot].rank > subsets[yroot].rank)
	      subsets[yroot].parent = xroot;
	    else {
	      subsets[yroot].parent = xroot;
	      subsets[xroot].rank++;
	    }
	  }
	
	//GRAPH CLASS: Keeps source, destination and weight
	//between the two and a compareTo method to sort based on weights. 
	class Graph implements Comparable<Graph> {
	    int s, d, w;

	    public int compareTo(Graph compareEdge) {
	      return this.w - compareEdge.w;
	    }
	  };
	  
	//SUBSET CLASS: Holds the parent of each subset 
	//that gets formed for checking cycle
	class subset {
		int parent, rank;
	};

  

  



  

  

  
}

