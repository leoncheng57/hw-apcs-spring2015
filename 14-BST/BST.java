/*
  TODO
  recursively (first do it with search)
  print
 */

public class BST{

    private Node r;
    
    public Node getR(){
	return r;
    }

    public void setR(Node n){
        r=n;
    }
    
    // public Node search(Node t, int i){
    // 	while (t!=null){
    // 	    int c = t.getData()-i;
    // 	    if (c==0)
    // 		return t;
    // 	    else if (c>0)
    // 		t=t.getRight();
    // 	    else
    // 		t=t.getLeft();
    // 	}
    // 	return null;
    // }

    public Node search(Node t, int i){
	Node ret = null;
	if (t!=null){
	    System.out.print(t.getData()+"  ");
	    System.out.println("I am at t:"+t+"with i:"+i);
       	    if (t.getData()==i){
		System.out.println("RETURNING");
		ret = t;
	    }
	    else{
		search(t.getRight(),i);
		search(t.getLeft(),i);
	    }
	}
	return ret;
    }
    
    public void insert(Node t,int i){
	r=t;
	if (t==null){
	    t=new Node(i);
	    System.out.println("I have inserted!"+i);
	    r=t;
	    return;
	}
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
	t.setR(null);
	t.insert(t.getR(),1);
    	t.insert(t.getR(),4);
    	t.insert(t.getR(),5);
    	t.insert(t.getR(),2);
    	System.out.println(t.search(t.getR(),0));
    	System.out.println(t.search(t.getR(),1));
	System.out.println(t.search(t.getR(),2));
	System.out.println(t.search(t.getR(),5));

    }
    
}
