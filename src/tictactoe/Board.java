package tictactoe;

public class Board {
    private char Board[][];
    private int BoardSize=3;
    private char p1Symbol , p2Symbol ;
    private int count;
    private static final char EMPTY=' ';
    public static final int PLAYER1WINS=1;
    public static final int PLAYER2WINS=2;
    public static final int DRAW=3;
    public static final int INCOMPLETE=4;
    public static final int INVALIDMOVE=5;
    
    public Board(char p1Symbol, char p2Symbol) {
        Board = new char[BoardSize][BoardSize]; // Initialize the 2D array
        for (int i = 0; i < BoardSize; i++) {
            for (int j = 0; j < BoardSize; j++) {
                Board[i][j] = EMPTY;
            }
        }
        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }

    public void print() {
    	System.out.println("-----------------");
    	for(int i=0;i<BoardSize;i++) {
    		for(int j=0;j<BoardSize;j++) {
    			System.out.print("| "+Board[i][j]+" |");
    		}
    		System.out.println();
    		System.out.println("-----------------");
    	}
    	
    }
	public int move(char symbol, int x, int y) {
		if(x<0 || x>=BoardSize || y<0 || y>=BoardSize || Board[x][y]!=EMPTY) {
			return INVALIDMOVE;
		}
		Board[x][y]=symbol;
		count++;
		//Row
		if(Board[x][0]==Board[x][1] && Board[x][0]==Board[x][2]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;   //if its player1 symbol then player 1 wins else player2 wins
		}
		//column
		if(Board[0][y]==Board[1][y] && Board[0][y]==Board[2][y]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		//diagonal
		if(Board[0][0] !=EMPTY &&Board[0][0]==Board[1][1] && Board[0][0]==Board[2][2]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		//second diagonal
		if(Board[0][2]!=EMPTY && Board[0][2]==Board[1][1] && Board[0][2]==Board[2][0]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		if(count==BoardSize*BoardSize) {
			return DRAW;
		}
		return INCOMPLETE;
	}
}
