package Graph;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class graph {
	public static void BreadthWistTraversal(int adjMatrix[][]) {
		Queue<Integer>pendingVertices=new LinkedList<>();
		boolean visited[]=new boolean[adjMatrix.length];
		visited[0]=true;
		pendingVertices.add(0);
		while(!pendingVertices.isEmpty()) {
			int currentVertex=pendingVertices.poll();
			System.out.print(currentVertex+" ");
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currentVertex][i]==1 && !visited[i]) {
					// i is unvisited neighbour of current vertex
					pendingVertices.add(i);
					visited[i]=true;
				}
			}
		}
	}
    public static void depthFirstTraversal(int adjMatrix[][],int currentVertex,boolean visited[]) {
    	visited[currentVertex]=true;
		System.out.println(currentVertex+" ");
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i]==1 && visited[i]==false) {
				// if condition satisfies means i is the neighbour of currentVertex
				depthFirstTraversal(adjMatrix,i,visited);  //here we are using recursion for travelling
			}
		}
	}
    //for testing depth first traversal use the example below
    // 4 3
    // 0 1
    // 0 3 
    // 1 2
	public static void depthFirstTraversal(int adjMatrix[][]) {
		boolean visited[]=new boolean[adjMatrix.length];
		for(int i=0;i<adjMatrix.length;i++) {
			if(!visited[i]) {
			depthFirstTraversal(adjMatrix,i,visited);
			System.out.println();
			}
		}
		
	}
	public static ArrayList<Integer> getPathBFS(int adjMatrix[][], int s, int e){
		Queue<Integer> pendingVertices = new LinkedList<>(); 
		HashMap<Integer, Integer> map = new HashMap<>(); 
		boolean visited[] = new boolean[adjMatrix.length]; 
		visited[s] = true; 
		pendingVertices.add(s); 
		map.put(s, -1); 
		boolean pathFound = false;

		while(!pendingVertices.isEmpty()){
		int currentVertex = pendingVertices.poll(); 
		for(int i = 0; i < adjMatrix.length; i++){ 
		if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
		pendingVertices.add(i); 
		visited[i] = true; 
		map.put(i, currentVertex); 
		if(i == e) {
		// Path found 
		pathFound = true; 
		break;
		}
		}
		}
		}
		if(pathFound){
		ArrayList<Integer> path = new ArrayList<>(); 
		int currentVertex = e; 
		while( currentVertex != -1){
		path.add(currentVertex); 
		int parent = map.get(currentVertex); 
		currentVertex = parent;
		}
		return path;
		}else{
		return null;
		}
		}

   public static void main(String args[]) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();    //number of vertices
	   int e=s.nextInt();   //number of edges
	   int adjMatrix[][]=new int[n][n];
	   for(int i=0;i<e;i++) {
		   int v1=s.nextInt();
		   int v2=s.nextInt();
		   adjMatrix[v1][v2]=1;
		   adjMatrix[v2][v1]=1;
	   }
	   BreadthWistTraversal(adjMatrix);
	   // for testing input
	         //5 4
	        //0 2
	       //0 3
	      //2 1
	     //3 4
	   //depthFirstTraversal(adjMatrix);
	   //for testing give input
	        // 4 5
	       // 0 1
	      // 0 2
	     // 0 3
	    // 1 3
	   // 2 3
//	   for(int i=0;i<n;i++) {
//		   for (int j=0;j<n;j++) {
//			   System.out.print(adjMatrix[i][j]+" ");
//		   }
//		   System.out.println();
//	   }
   }
}
