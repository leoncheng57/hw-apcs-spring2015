public class Queens{

    private char[][] board;
    private char queen = 'Q';
    private char blank = '#';
    private boolean solved;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public Queens(int n){
	board = new char[n][n];
	for (int x=0;x<board.length;x++){
	    for (int y=0;y<board[0].length;y++){
		board[x][y]='#';
	    }
	}
    }
    
    public String toString(){
	String s = "[2J\n";
	for (int x =0;x<board.length;x++){
	    for (int y =0;y<board[0].length;y++){
		s = s+board[x][y];
	    }
	    s= s+"\n";
	}
	return s;
    }

    public void solve(int x, int y, int count){
	if (count == board.length){
	    solved = true;
	}
	if (){
	    return;
	}
	count++;
	solve(
	if (!solved){
	    board[x][y]='#';
	}
    }
    
    public static void main(String[] args){
	Queens q = new Queens(5);
	//q.solve();
	System.out.println(q);
    }
}
