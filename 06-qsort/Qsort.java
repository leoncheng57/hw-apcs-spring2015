import java.util.*;
import java.io.*;

public class Qsort {
     
    private int array[];
     
    public void quickSort(int[] inputArr) {
         
        if (inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        quickSort(0, array.length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
	int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
     
    public static void main(String[] args){
        Qsort q = new Qsort();
        int[] arr = {24,2,45,20,56,75,2,56,99,53,12};
        System.out.println(Arrays.toString(arr));
	q.quickSort(arr);
	System.out.println(Arrays.toString(arr));
    }
}
