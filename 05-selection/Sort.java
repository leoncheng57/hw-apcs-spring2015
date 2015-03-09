import java.util.*;
import java.io.*;

public class Sort{

    private int[] arr = {5,10,1,3,4,8,9,2,7};    
    //arr MUST HAVE NO DUPLICATE VALUES
    
    public void select(int k){
	select(arr,k,0,arr.length-1);
    }

    /*
      A = the array
      k = we are looking for the kth smallest element in arr 
      L = original lower index
      Li = lower index
      H = original higher index
      Hi = higher index
      P = pivot value
      Pi = pivot index
     */
    public void select(int[] A,int k,int L,int H){
	
	int P = A[H];
	int Pi = H;
	//leaving L and H untampered with 
	int Li = L;
	int Hi = H;
	print( Li, Hi, Pi, k, A);	    

	//The main workload: 
	//swapping things to the left or right side ofthe array
	while (Hi>Li){
	    if (A[Li]<P){
		//just leave the element on the left side and move on
		Li++;
	    }
	    else{
		//swap higher element to the right side of the array
		int tmp = A[Li];
		A[Li] = A[Hi];
		A[Hi]=tmp;
		Hi--;
	    }
	    print( Li, Hi, Pi, k, A);	    
	}

	//now Hi and Li have met at some point in the middle
	//so we need to swap the pivot value into... 
	//its correct place in the middle of the array
	if (A[Li]>P){
	    A[Pi] = A[Li];
	    A[Li] = P;
	    Pi = Li;
	}
	else {
	    //if A[Li] is smaller thatn the pivot value...
	    //put the pivot value to the right A[Li]
	    A[Pi] = A[Li+1];
	    A[Li+1] = P;
	    Pi = Li+1;
	}
	print( Li, Hi, Pi, k, A);	    
	
	//either found OR retry with smaller portion of array
	if (k==Pi){
	    System.out.printf("FOUND!: The %dth value is %d \n",k,A[Pi]);
	}
	else{
	    if (k<Pi){
		select(A,k,L,Pi-1);
	    }
	    else {
		select(A,k,Pi+1,H);
	    }
	}	    
    }
    
    public void print(int Li, int Hi, int Pi, int k, int[] A){
	String s = String.format("Li=%d, Hi=%d, Pi=%d, k=%d",Li,Hi,Pi,k);
	s+="\n";
	s+=Arrays.toString(A);
	s+="\n";
	System.out.println(s);
    }

    //-------------------[MAIN]-----------------------
    public static void main(String[] args){
	Sort s = new Sort();
	s.select(3);
    }
}
