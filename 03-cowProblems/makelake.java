import java.util.*;
import java.io.*;

public class makelake{

    int[][] land = {{28,25,20,32,34,36},
		    {27,25,20,20,30,34},
		    {24,20,20,20,20,30},
		    {20,20,14,14,20,20}};
		     
    int[][] herd; //3x3 grid

    int row, col, elev;
    
    public makelake(int a, int b, int c){
	row = a;
	col = b;
	elev = c;
    }
    
    /*
      extracts the herd from the given stuff
     */
    public void makeHerd(int r, int c){
	herd = new int[3][3];
	int maxRow = r+2;
	int maxCol = c+2;
	for (int row = r; row<=maxRow;row++){
	    for (int col = c; col<=maxCol; col++){
		herd[row-r][col-c] = land[r][c];
	    }
	}
    }

    public void printHerd(){
	for (int[] arr : herd){
	    System.out.println(Arrays.toString(arr));
	}
    }
    
    /*
      find the largest number in herd
      decrease it by one
      see if any neighbors have the same number
      subtract one from all those
      keep going until you reach the elev to be stomped down
     */
    public void stomp(int r, int c, int down){}
    
    
    /*
      subtract desired elevation of lake from each element in land
      remove negatives
      sum it up
      multiply by 72*72
    */
    public void findArea(){}

    /*---------------------MAIN-------------------------*/
    public static void main(String[] args){
	makelake m = new makelake(4,6,22);
	m.makeHerd(1,1);
	m.printHerd();
    }
}
