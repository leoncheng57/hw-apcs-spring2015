import java.io.*;
import java.util.*;
public class Tree{

    Node r;

    public Node search(Node t, int i){
	if (t==null || t.getData()==i)
	    return t;
	else if (t.getData() < i)
	    return search(t.getRight(),i);
	else
	    return search(t.getLeft(),i);	
    }

    public String search(int i){
	Node retval = search(r,i);
	if (retval==null)
	    return "Not Found";
	else
	    return ""+retval;
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

    public String traverse(Node t){
	if (t==null){
	    return ",";
	}
	else{
	    return traverse(t.getLeft())+t.getData()+traverse(t.getRight());
	}
    }
    
    public String toString(){
	return traverse(r);
    }

    public int maxValue(){
	return maxValue(r);
    }
    
    //INCOMPLETE
    //pretending that it is not a binary SEARCH tree, just a binary tree
    public int maxValue(Node t){
	if (t==null){
	    return -1; //this value should never be the max, should be smaller than all values in the tree
	}
	else{
	    System.out.println(t+"HELLO");
	    if (maxValue(t.getLeft())>maxValue(t.getRight())) return maxValue(t.getLeft());
	    else  return maxValue(t.getRight());
									      
	}	    
    }

    public int height(){
	return height(r);
    }
    
 
    public int height(Node t){
	int maxHeight = 0;
	if (t==null) return 0;
	else {
	    int left = 1+height(t.getLeft());
	    int right = 1+height(t.getRight());
	    if (left>right) return left;
	    else return right;
	}
    }
    
    
    // height(Node t);
    // splitDupes(Node t);
    // longest(Node t); //how in the world to do this?
    
    
    public static void main(String[] args){
	Tree t = new Tree();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	System.out.println(t);
	//				t.insert(30);
	System.out.println(t.search(30));
	System.out.println(t.maxValue());
	System.out.println(t.height());
    }
}






								


		
