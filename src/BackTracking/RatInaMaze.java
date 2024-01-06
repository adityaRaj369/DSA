package BackTracking;

public class RatInaMaze {
    
	public static boolean findPath(int maze[][],int i,int j,int path[][]) {
		int n=maze.length;
		// check if i,j cell is valid or not
		if(i<0 || i>n || j<0 || j>n || maze[i][j]==0 || path[i][j]==1) {
			return false;
		}
		//including cell in current path
		path[i][j]=1;
		//checking destination cell
		if(i== n-1 && j==n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			return true;
		}
		// explore further in all direction
		// exploring top cell for which i=i-1 and j that is column number will be same
		if(findPath(maze,i-1,j,path)) {
			return true;
		}
		//right
		if(findPath(maze,i,j+1,path)) {
			return true;
		}
		//down
		if(findPath(maze,i+1,j,path)) {
			return true;
		}
		//left
		if(findPath(maze,i,j-1,path)) {
			return true;
		}
		return false;
	}
	public static void PrintAllPath(int maze[][],int i,int j,int path[][]) {
		int n=maze.length;
		// check if i,j cell is valid or not
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1) {
			return;
		}
		//including cell in current path
		path[i][j]=1;
		//checking destination cell
		if(i== n-1 && j==n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j]=0;  //here after visiting all cells we are setting  cell which we visited to zero
			return ;
		}
		// explore further in all direction
		// exploring top cell for which i=i-1 and j that is column number will be same
		PrintAllPath(maze,i-1,j,path);
		PrintAllPath(maze,i,j+1,path);
		PrintAllPath(maze,i+1,j,path);
		PrintAllPath(maze,i,j-1,path);
		path[i][j]=0;  //before we are returning we are setting all paths to zero
		
	}
	public static boolean ratInMaze(int maze[][]) {
		int n=maze.length;
		int path[][]=new int [n][n];
		return findPath(maze,0,0,path);
		
	}
	public static void AllPathMaze(int maze[][]) {
		System.out.println("below are all path's of the maze");
		int n=maze.length;
		int path[][]=new int [n][n];
	    PrintAllPath(maze,0,0,path);
	}
	public static void main(String [] args) {
		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		Boolean PossiblePath=ratInMaze(maze);
		System.out.println(PossiblePath);
		AllPathMaze(maze);
	}
}
