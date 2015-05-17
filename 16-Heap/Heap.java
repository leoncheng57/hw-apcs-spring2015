import java.util.*;
import java.io.*;

public class Heap{
  
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
  
  public int removeMin(){
    int ret = data.get(0);
    int n = data.remove(data.size()-1);
    data.set(0,n);
    pushDown(n);
    return ret;
  }
  
  public void pushDown(int n){
    int hold = data.indexOf(n);
    int leftChildIndex = hold*2;
    int rightChildIndex = hold*2+1;
    while(leftChildIndex<data.size() && rightChildIndex<data.size() &&
      (data.get(hold)>data.get(leftChildIndex) || data.get(hold)>data.get(rightChildIndex))){
      if (data.get(leftChildIndex)<data.get(rightChildIndex)){
        int tmp = data.get(hold);
        data.set(hold,data.get(leftChildIndex));
        data.set(leftChildIndex,tmp);
        hold = leftChildIndex;
      }
      else{
        int tmp = data.get(hold);
        data.set(hold,data.get(rightChildIndex));
        data.set(rightChildIndex,tmp);
        hold = rightChildIndex;
      }
      leftChildIndex = hold*2;
      rightChildIndex = hold*2+1;
    }
  }
  
  public String heapSort(ArrayList<Integer> intArrayList){
    for (int i = intArrayList.size()-1;i>=0;i--){
      pushDown(intArrayList.get(i));
    }
    return ""+intArrayList;
  }
  
  public String toString(){
    return data+"";
  }
  
  public static void main (String[] args) {
    Heap h = new Heap();
    h.insert(200);
    h.insert(13);
    h.insert(12313);
    h.insert(213);
    h.insert(2011);
    System.out.println(h);
    h.removeMin();
    System.out.println(h);
    int[] elements = {12,312,3463,62,52235,262,52,123432};
    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    for (int element : elements){
      intArrayList.add(element);
    }
    System.out.println(intArrayList);
    h.heapSort(intArrayList);
  }
}