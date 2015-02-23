/*
  NOTE: THIS IS INCOMPLETE AND NOT WORKING
 */
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

    public boolean canPlace(int x, int y){
	return check(x,y,-1,-1) && check(x,y,-1,0) && check(x,y,0,-1) && check(x,y,0,1) && check(x,y,1,0) && check(x,y,1,1);
    }

    public boolean check(int x, int y, int deltaX, int deltaY){
	int otherX=x;
	int otherY=y;
	while (otherX<board.length && otherY<board.length && otherX>=0 && otherY>=0){
	    if (board[otherX][otherY]!='#'){
		return false;
	    }
	    otherX+=deltaX;
	    otherY+=deltaY;
	}
	return true;
    }
    
    public void solve(int x, int y, int count){
	if (count == board.length){
	    solved = true;
	}
	if(!canPlace(x,y)){
	    return;
	}
	count++;
	for (int i = 0; i<board.length;i++){
	    solve(x+i,y+1,count);
	}
	if (!solved){
	    board[x][y]='#';
	}
    }

    public void solve(int x, int y){
	solve(x,y,1);
    }
    
    public static void main(String[] args){
	Queens q = new Queens(5);
	q.solve(1,1);
	System.out.println(q);
    }
}
