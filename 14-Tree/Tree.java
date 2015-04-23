public class Tree{

    public Node search(Node T, int i){
	while (T!=null){
	    int c = t.getData.compareTo(i);
	    if (c==0)
		return T;
	    else if (c>0)
		T=T.getRight();
	    else
		T=T.getLeft();
	}
	return null;
    }

    //unfinished
    public Node insert(Node T, int x){
	if (T==null){
	    T=new Node();
	    T.setData(x);
	    return;
	}
	Node T2;
	while (T!=null){
	    T2 = T;
	    int c = t.getData.compareTo(i);
	    if (c==0)
		return T;
	    else if (c>0)
		T=T.getRight();
	    else
		T=T.getLeft();
	}
	return null;
    }
    
}
