import java.util.*;
import java.io.*;

public class mergesort{
    /*
      a and b are ArrayLists that are alread sorted from low to high.
      The could be empty

      build and return a sorted ArrayList using the merge technique we
      discussed in class
    */
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> ret = new ArrayList<Integer>();
	int i = 0;
	int k = 0;
	while (i<a.size()&&k<b.size()){
	    if (a.get(i)<b.get(k)){
		ret.add(a.get(i));
		i++;
	    }
	    else{
		ret.add(b.get(k));
		k++;
	    }
	}
	// if(i>a.size()){
	//     ret = ret + a.subList(i,a.size());
	// }
	// if (k>b.size()){
	//     ret = ret + b.subList(n,b.size());
	// }
    }

    public static void main(String[] args){
	mergesort obj = new mergesort();
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	obj.sort(a,b);
    }
}
