import java.util.*;
import java.io.*;
import java.lang.System;

public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	for (int i=0;i<5;i++){
	    l.add(i);
	}
	System.out.println(l);

	System.out.println();
	System.out.println(l.get(3));

	
	System.out.println();
	l.add(0,42);

	System.out.println();
	System.out.println(l.remove(1));
	System.out.println(l.remove(42));
	System.out.println(l.remove(32131));
	System.out.println(l);	
	
	System.out.println();
	System.out.println(l.size());

	//COMPARING SPEEDS-----------------------------
	Random rnd = new Random();
	int quantity = 10000;
	long start, elapsed;
		
	//ARRAYLIST
	ArrayList<Integer> al = new ArrayList<Integer>();
	for (int i = 0; i< quantity; i++){
	    al.add(rnd.nextInt(100));
	}
	System.out.println();
	
	ArrayList<Integer> L=al;
	int sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<L.size(); i++){
	    sum = sum + L.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Time for arraylist= "+elapsed);
	

	//LINKEDLIST
	LList L2 = new LList();
	for (int i =0 ; i<quantity; i++){
	    L2.add(rnd.nextInt(1000));
	}
	System.out.println();
	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<L2.size(); i++){
	    sum = sum + L2.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Time for LList= "+elapsed);

	//BUILTIN 
	LinkedList<Integer> L3 = new LinkedList<Integer>();
	for (int i =0 ; i<quantity; i++){
	    L3.add(rnd.nextInt(1000));
	}
	System.out.println();
	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<L3.size(); i++){
	    sum = sum + L3.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Time for LList= "+elapsed);

    }
}
