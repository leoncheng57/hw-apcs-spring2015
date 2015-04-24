public class Tree{

    private Node r;

    public Node search(int i){
    	Node T=r;
    	while (T!=null){
    	    int c = T.getData()-i;
    	    if (c==0)
    		    return T;
    	    else if (c>0)
    		    T=T.getRight();
    	    else
    		    T=T.getLeft();
    	}
    	return null;
    }

    
    public void insert(int i){
    Node T = r;
	if (T==null){
	    T=new Node(i);
	    return;
	}
	Node T2 = new Node();
	while (T!=null){
	    T2 = T;
	    int c = T.getData()-i;
	    if (c>=0)
		T=T.getRight();
	    else
		T=T.getLeft();
	}
	int c = T2.getData()-i;
	if (c>=0) T2.setRight(new Node(i));
	else T2.setLeft(new Node(i));
    }

    public static void main(String[] args){
    	Tree t = new Tree();
    	t.insert(1);
    	t.insert(4);
    	t.insert(5);
    	t.insert(2);
    	System.out.println(t.search(0));
    	System.out.println(t.search(1));
    	System.out.println(t.search(2));

    }
    
}
