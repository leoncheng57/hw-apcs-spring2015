public class Knights{

    private int[][] board;
    private boolean solved = false;

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
		s = String.format(s+"%3d",board[x][y]);
	    }
	    s=s+"\n";
	}
	return s;
    }

    public void solve(int x, int y, int count){
	if (x>=board.length || x<0 ||  y>=board[0].length || y<0 || board[x][y]!=0){
	    return;
	}
	if (count == 25){
	    solved = true;
	}	
	//delay(800);
	board[x][y] = count;
	count++;
	System.out.println(this);
	System.out.printf("count=%d, x=%d, y=%d \n",count,x,y);
	solve(x+1,y+2,count);
	solve(x+1,y-2,count);
	solve(x-1,y+2,count);
	solve(x-1,y-2,count);
	solve(x+2,y+1,count);
	solve(x-2,y+1,count);
	solve(x+2,y-1,count);
    	solve(x-2,y-1,count);
	if (!solved){
	    board[x][y]=0;
	}
    }

    public void solve(int x, int y){
	solve(x,y,1);
    }
	
    public static void main (String[] args){
	Knights k = new Knights();
	k.solve(2,2);
    }    
}


