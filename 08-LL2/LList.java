import java.util.*;
import java.io.*;

public class LList{

    private Node l = new Node(-1); //this is the dummy node
    private int len = 0;

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	//s+="\n"+"len="+len;
	return s;
    }


    //NOTE: The dummy is not the zeroth element, but points to the 0th element
    public int get(int n){
	if (n<0 || n>len){
	    throw new NoSuchElementException();
	}
	Node tmp = l;
	while (n>0){
	    tmp = tmp.getNext();
	    n--;
	}
	return tmp.getNext().getData();	
    }
        
    public void add(int s){
	Node tmp = new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }


    public void add(int n, int s){
	if (n<0 || n>len){
	    throw new NoSuchElementException();
	}
	Node tmp = l;
	for (n=n;n>1;tmp=tmp.getNext()){
	    n--;
	}
	Node newbie = new Node(s);
	newbie.setNext(tmp.getNext());
	tmp.setNext(newbie);
	len++;
    }

    //this remove takes input: index 
    /*
    public int remove(int n){
	if (n<0 || n>len){
	    throw new NoSuchElementException();
	}	
	Node tmp = l;
	for (int i=0; i<n;i++){
	    tmp = tmp.getNext();
	}
	int s = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	len--;
	return s;
    }
    */

    //this remove takes input: value i
    public boolean remove (int i){
	Node tmp = l;
	for (tmp=tmp;tmp.getNext() != null; tmp=tmp.getNext()){
	    if (tmp.getNext().getData()==i){
		tmp.setNext(tmp.getNext().getNext());
		len--;
		return true;
	    }
	}
	return false;
    }
    
    public int size(){
	return len;
    }
    
}
