import java.util.*;
import java.io.*;

/*
  a and b are ArrayLists that are alread sorted from low to high.
  The could be empty

  build and return a sorted ArrayList using the merge technique we
  discussed in class
*/

public class mergesort{

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> ret = new ArrayList<Integer>();
	int i = 0;
	int k = 0;
	while (i<a.size() && k<b.size()){
	    if (a.get(i)<b.get(k)){
		ret.add(a.get(i));
		i++;
	    }
	    else{
		ret.add(b.get(k));
		k++;
	    }
	}
	if(i<a.size()){
	    for (i=i;i<a.size();i++)
		ret.add(a.get(i));
	}
	if(k<b.size()){
	    for (k=k;k<b.size();k++)
		ret.add(b.get(k));
	}	
	return ret;
    }
    
    public static void main(String[] args){
	mergesort m = new mergesort();
	ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,6,99));
	ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(0,4,5,7,8,9,12,51,65,78,98));
	System.out.println(m.merge(a,b));
    }
}
