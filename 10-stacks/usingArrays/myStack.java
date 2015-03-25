import java.io.*;
import java.util.*;

public class myStack{
    
    private Object[] a;
    
    public myStack(){
	a = new Object[0];
    }
    
    public void extend(){
	Object[] tmp = new Object[a.length+1];
	for (int i =0 ;i<a.length;i++){
	    tmp[i+1]=a[i];
	}
	a=tmp;
    }
    
    public void push(Object s){
	extend();
	a[0]=s;
    }

    public Object pop(){
	Object ret = a[0];
	Object[] tmp = new Object[a.length-1];
	for (int i=0;i<a.length-1;i++){
	    tmp[i]=a[i+1];
	}	
	a = tmp;
	return ret;
    }

    public boolean empty(){
	return a.length==0;
    }

    public Object top(){
	return a[0];
    }
    
    public String toString(){
	return Arrays.toString(a);
    }
    
}
