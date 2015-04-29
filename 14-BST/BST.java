import java.io.*;
import java.util.*;

public class BST{
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
	    return " ";
	}
	else {
	    return traverse(t.getLeft())+t.getData()+traverse(t.getRight());
	}
    }
    
    public String toString(){
	return traverse(r);
    }

    public void remove(int i){
	Node t2=null;
	Node t = r;
	if (r==null){
	    return;
	}
								
	while (t!=null && t.getData()!=i){
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

	if (t.getRight() == null)
	    t2.setLeft(t.getLeft());
	else if (t.getLeft() ==null)
	    t2.setRight(t.getRight());
	else{
	    Node l2 = null;
	    Node l = t.getLeft();
	    while(l.getRight()!=null){
		l2=l;
		l=l.getRight();
	    }
	    t=l;
	    if (l.getRight() == null)
		l2.setLeft(l.getLeft());
	    else if (l.getLeft() ==null)
		l2.setRight(l.getRight());
		
	}
	
    }
    
    public static void main(String[] args){
	BST t = new BST();
	Random r = new Random();
	for (int i = 0; i < 10; i ++){
	    t.insert(i);
	}
	System.out.println(t);
	t.remove(2);
	t.remove(4);
	t.remove(5);
	System.out.println(t);
	
    }
}






								


		
