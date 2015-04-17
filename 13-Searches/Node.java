
public class Node {
    private int x,y;
    private Node prev;
    private double priority;
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;
	int ex = Maze.end.getX();
	int ey = Maze.end.getY();
	int dx = Math.abs(ex-x);
	int dy = Math.abs(ey-y);
	double p = dx  + dy;
	//double p = Math.sqrt(dy**2+dx**2);
	priority = p;
    }

    public double getPriority(){
	return priority;
    }
    
    public void setPriority(double p){
	priority = p;
    }
    
    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
		
}










