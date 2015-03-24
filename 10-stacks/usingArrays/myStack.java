//NOTE: JUST TRYING IT OUT WITH ARRAYLISTS FIRST, before converting to arrays

import java.io.*;
import java.util.*;

public class myStack<E>{
    
    private ArrayList<E> al;
    
    public myStack(){
	al =  new ArrayList<E>();
    }

    public void push(E s){
	al.add(0,s);
    }

    public E pop(){
	return al.remove(0);
    }

    public boolean empty(){
	return al.size() == 0;
    }

    public E top(){
	return al.get(0);
    }
    
    public String toString(){
	return al+"";
    }
    
}
