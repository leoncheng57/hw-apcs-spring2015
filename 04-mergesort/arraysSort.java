import java.io.*;
import java.util.*;

public class arraysSort{
    
    public int[]  merge(int[] a, int[] b){
	int[] ret = new int[a.length+b.length];
	int x = 0;
	int y = 0;
	while (x<a.length && y<b.length){
	    //System.out.printf("a[%d]=%d and b[%d]=%d",x,a[x],y,b[y]);
	    if (a[x]<b[y]){
		ret[x+y]=a[x];
		x++;
	    }
	    else{
		ret[x+y]=b[y];
		y++;
	    }
	    //System.out.println("\nret: "+Arrays.toStrxng(ret));
	}
	if(x<a.length){
	    for (x=x;x<a.length;x++)
		ret[x+y]=a[x];
	}
	if(y<b.length){
	    for (y=y;y<b.length;y++)
		ret[x+y]=b[y];
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
