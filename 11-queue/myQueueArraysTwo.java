public class myQueueArraysTwo{
    private int[] a;
    private int start;
    private int end;
    
    public myQueueArraysTwo(){
	a = new int[5];
	start = 0;
	end = 0;
    }

    public void enqueue(int n){
	a[end]=n;
	end++;
    }

    public int dequeue(){
	//INCOMPLETE
	return a[start];
	a[start]=null;
	start++
    }
    
}
