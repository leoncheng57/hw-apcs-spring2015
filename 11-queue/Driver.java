public class Driver{
    public static void main (String[] args){
	myQueue<Integer> mQ = new myQueue<Integer>();
	System.out.println(mQ.empty());
	System.out.println(mQ);
	mQ.enqueue(313123);
	mQ.enqueue(1432);
	mQ.enqueue(4312);
	System.out.println(mQ);
	System.out.println(mQ.dequeue());
	System.out.println(mQ.dequeue());
	System.out.println(mQ);
	System.out.println(mQ.empty());
	System.out.println(mQ.head());
	
    }
}
