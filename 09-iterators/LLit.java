import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> ti; //initial t
    
    public LLit(Node<E> n){
	t = n.getNext();
	ti = n;
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
	while (ti.getNext()!=t){
	    ti=ti.getNext();
	}
	ti.setNext(t.getNext()); //this means that remove can only be used once per use of next
    }
    
}
