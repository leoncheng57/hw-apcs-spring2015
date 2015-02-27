import java.util.*;
import java.io.*;

public class arrayListsSort{

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> ret = new ArrayList<Integer>();
	while (a.size()>0 && b.size()>0){
	    if (a.get(0)<b.get(0)){
		// ret.add(a.get(0));
		// a.remove(0);
		ret.add(a.remove(0));
	    }
	    else{
		//ret.add(b.get(0));
		//b.remove(0);
		ret.add(b.remove(0));
	    }
	}
	if (a.size()>0){
	    for(int n : a)
		ret.add(n);
	}
	if (b.size()>0){
	    for (int n : b)
		ret.add(n);
	}
	return ret; 
    }

    public static void main(String[] args){
	arrayListsSort al = new arrayListsSort();
	ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,6,99));
	ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(0,4,5,7,8,9,12,51,65,78,98));
	System.out.println(al.merge(a,b));
	
    }
}
