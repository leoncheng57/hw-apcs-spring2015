import java.util.*;
import java.io.*;

public class myQueueArraysOne{

    private int[] a;

    public myQueueArraysOne(){
	a = new int[0];
    }

    public void adjust(){
	int[] tmp = new int[a.length+1];
	for (int i =0 ;i<a.length;i++){
	    tmp[i]=a[i];
	}
	a=tmp;
    }
    
    public void enqueue(int data){
	adjust();
	a[a.length-1]=data;
    }

    public void adjust2(){
	int[] tmp = new int[a.length-1];
	for (int i=0;i<a.length-1;i++){
	    tmp[i]=a[i+1];
	}
	a=tmp;
    }
    
    public int dequeue(){
	int stuff = a[0];
	adjust2();
	return stuff;
    }

    public String toString(){
	return Arrays.toString(a);
    }
    
    
}
