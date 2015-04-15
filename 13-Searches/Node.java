
public class Node {
    private int x,y;
    private Node prev;
    private double priority;
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }

    public void setPriority(int bleh){
	priority = bleh;
    }

    public double getPriority(){
	return priority;
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










