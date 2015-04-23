public class Node{
    private Node left, right;
    private int data;

    public int getData(){
	return data;
    }

    public void setData(int x){
	data = x;
    }
	

    public Node getLeft(){
	return left;
    }

    public void setLeft(Node n){
	left = n;
    }
    
    public Node getRight(){
	return right;
    }

    public void setright(Node n){
	right = n;
    }

    public int compareTo(Node n){
	return this.data-n.getData();
    }
}
