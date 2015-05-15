import java.util.*;
import java.io.*;

public class Heap{
  
  //write heapsort!!!
  
  private ArrayList<Integer> data;
  
  public Heap(){
    data = new ArrayList<Integer>(); 
  }
  
  public void insert(int n){
    data.add(n);
    siftUp(n);
  }  
    
  public void siftUp(int x){
    int hold = data.indexOf(x);
    int parentIndex=hold/2;
    while (data.get(parentIndex)>data.get(hold)){
        int tmp = data.get(parentIndex);
        data.set(parentIndex,data.get(hold));
        data.set(hold,tmp);
        hold = parentIndex;
        parentIndex = parentIndex/2;
    }
  }
  
  public String toString(){
    return data+"";
  }
  
  public static void main (String[] args) {
    Heap h = new Heap();
    h.insert(200);
    h.insert(213);
    h.insert(201);
    h.insert(13);
    System.out.println(h);
  }
}