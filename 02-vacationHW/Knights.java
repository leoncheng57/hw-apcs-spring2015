public class Knights{

    private int[][] board;

    public void delay(int n){
	try{
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public Knights(){
	board = new int[5][5];
	for (int x=0;x<board.length;x++){
	    for (int y =0;y<board[0].length;y++){
	        board[x][y]=0;
	    }
	}
    }

    public String toString(){
	String s = "[2J\n";
	for (int x=0;x<board.length;x++){
	    for (int y =0;y<board[0].length;y++){
		s = s+board[x][y];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public void solve(int x, int y){
	/*
	  return if !=0
	  exit if reached N*N=25
	  otherwise: try one in each direction 
	  solve: x+1,y+2..x-1,y+2..etc
	 */
	solve(x+1,y+2);
	solve(x+1,y-2);
	solve(x-1,y+2);
	solve(x-1,y-2);
	solve(x+2,y+1);
	solve(x-2,y+1);
	solve(x+2,y-1);
    	solve(x-2,y-1);
    }
	
    public static void main (String[] args){
	Knights k = new Knights();
	System.out.println(k);
    }
    
}


