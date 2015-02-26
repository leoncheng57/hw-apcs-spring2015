import java.io.*;
import java.util.*;

public class arraysSort{
    
    public int[]  merge(int[] a, int[] b){
	int[] ret = new int[a.length+b.length];
	int i = 0;
	int k = 0;
	while (i<a.length && k<b.length){
	    //System.out.printf("a[%d]=%d and b[%d]=%d",i,a[i],k,b[k]);
	    if (a[i]<b[k]){
		ret[i+k]=a[i];
		i++;
	    }
	    else{
		ret[i+k]=b[k];
		k++;
	    }
	    //System.out.println("\nret: "+Arrays.toString(ret));
	}
	if(i<a.length){
	    for (i=i;i<a.length;i++)
		ret[i+k]=a[i];
	}
	if(k<b.length){
	    for (k=k;k<b.length;k++)
		ret[i+k]=b[k];
	}	
	return ret;
    }

    public static void main(String[] args){
	arraysSort s = new arraysSort();
	int[] a = {1,2,5,6,8,9,12,23,45,56,67,78,90,123};
	int[] b = {0,4,100,101,102,123};
	System.out.println(Arrays.toString( s.merge(a,b) ));
    }
    
}
