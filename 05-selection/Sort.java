import java.util.*;
import java.io.*;

public class Sort{
    
    int[] L; //input unsorted array
    int[] D; //array I create to do stuff in
    int pVal; //pivot value

    public void pivot(int[] a){
	L = a;
	D = new int[a.length];
	pVal = a[0];
	pivot(a,0,a.length-1); 
    }


    public void pivot(int[] a, int si, int ei){
	int i = 1; //si=1 because we are ignoring the first val of the array, the pVal
	while (si != ei){
	    if (L[i] < pVal){
		D[si]=L[i];
		si++;
	    }
	    else{
		D[ei] = L[i];
		ei--;
	    }
	    System.out.println(L[i]);
	    System.out.println(this);
	    i++;
	}
	D[si] = pVal;
    }

    public String toString(){
	return Arrays.toString(D);
    }
    
    //---------------[MAIN]----------------
    public static void main(String[] args){
	int[] a = {5,10,2,3,4,8,9,2,7};
	Sort s = new Sort();
	s.pivot(a);
	System.out.println(s);
    }
	
}
