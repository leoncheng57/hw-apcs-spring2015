import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;

    private Frontier f;
    private Node end;
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
      solved - instance variable to indicate we're done
			
    */
    public void solve(int x, int y){
	if (board[x][y]==wall ||
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    return;
	}

	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y+1);
	solve(x,y-1);
	if (!solved){
	    board[x][y]=visited;
	}
    }

    public double findPriority(int nx, int ny){
	int ex = end.getX();
	int ey = end.getY();
	int dx = Math.abs(ex-nx);
	int dy = Math.abs(ey-ny);
	double ret = dx + dy;
	//double ret = Math.sqrt(dx**2 + dy**2);
	return ret;
    }
    
    /*
      Only adds if the tx,ty spot is available path or exit
    */
    public void addToFront(int tx,int ty, Node current){
	Node tmp = null;
	if (board[tx][ty]=='#' || board[tx][ty]=='$'){
	    tmp = new Node(tx,ty,findPriority(tx,ty));
	    tmp.setPrev(current);
	    f.addInOrder(tmp);
	}
	System.out.println("ADDEDSOMETHING");
						
    }
    
    public void findExit(){
	for (int r = 0; r<board.length; r++){
	    for (int c = 0;c<board[0].length;c++){
		if (board[r][c]=='$'){
		    end = new Node(r,c,0);
		    break;
		}
	    }
	}
    }
    
    public void search(int x, int y){
	findExit();
	
	f = new Frontier();
	//f = new StackFront();

	f.add(new Node(x,y,findPriority(x,y)));

	int tx=0,ty=0;
	Node current = null;
	while (!f.isEmpty()){
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();

	    if (board[cx][cy]=='$')
		break;
						
	    board[cx][cy]='z';

	    addToFront(cx+1,cy,current);
	    addToFront(cx-1,cy,current);
	    addToFront(cx,cy+1,current);
	    addToFront(cx,cy-1,current);

	    delay(50);
	    System.out.println(this);
	    System.out.println("HELLO");
	    
	}

	// path recovery
	for (Node p = current.getPrev(); p != null ; p = p.getPrev()){
	    board[p.getX()][p.getY()] = 'P';
	    delay(100);
	    System.out.println(this);
	}
    }
		
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.search(1,1);
        System.out.println(m);
	
		
    }
}

