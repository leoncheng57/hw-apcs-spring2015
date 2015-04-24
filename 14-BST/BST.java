public class BST{

    private Node r;
    
    public Node search(int i){
    	Node t=r;
	while (t!=null){
    	    int c = t.getData()-i;
    	    if (c==0)
		return t;
    	    else if (c>0)
		t=t.getRight();
    	    else
		t=t.getLeft();
    	}
    	return null;
    }

    
    public void insert(int i){
	if (r==null){
	    r=new Node(i);
	    System.out.println("I have inserted!"+i);
	    return;
	}
	Node t = r;
	Node t2 = new Node();
	while (t!=null){
	    t2 = t;
	    int c = t.getData()-i;
	    if (c>=0)
		t=t.getRight();
	    else
		t=t.getLeft();
	}
	int c = t2.getData()-i;
	if (c>=0) t2.setRight(new Node(i));
	else t2.setLeft(new Node(i));
	
    }

    public static void main(String[] args){
        BST t = new BST();
	t.insert(1);
    	t.insert(4);
    	t.insert(5);
    	t.insert(2);
    	System.out.println(t.search(0));
    	System.out.println(t.search(1));
	System.out.println(t.search(2));

    }
    
}
