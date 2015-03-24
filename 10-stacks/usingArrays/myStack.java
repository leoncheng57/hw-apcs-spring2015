//NOTE: JUST TRYING IT OUT WITH ARRAYLISTS FIRST, before converting to arrays

import java.io.*;
import java.util.*;

public class myStack<E>{
    
    //private ArrayList<E> al;
    private Object[] a;
    
    public myStack(){
	//al =  new ArrayList<E>();
	a = new Object[0];
    }
    
    public void extend(){
	Object[] tmp = new Object[a.length+1];
	for (int i =0 ;i<a.length;i++){
	    tmp[i+1]=a[i];
	}
    }
    
    public void push(E s){
	//al.add(0,s);
	a.extend();
	a[0]=s;
    }

    public E pop(){
	//return al.remove(0);
	Object[] tmp = new Object[a.length-1];
	for (int i =1 ;i<a.length;i++){
	    tmp[i]=a[i-1];
	}	
	return a[0];
    }

    public boolean empty(){
	//return al.size() == 0;
	return a.length==0;
    }

    public E top(){
	//return al.get(0);
	return a[0];
    }
    
    public String toString(){
	return al+"";
    }
    
}
