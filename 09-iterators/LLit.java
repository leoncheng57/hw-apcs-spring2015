import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    
    public LLit(Node<E> n){
	t = n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	t = t.getNext();
	return retval;
    }
    
    public void remove(){
	System.out.println("RMOVEING");
	t.setNext(t.getNext().getNext());
    }
    
}
