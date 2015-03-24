public class Driver{
    public static void main (String [] args){
	myStack<String> mS = new myStack<String>();
	System.out.println(mS.empty());
	for (int i =0; i<10;i++){
	    mS.push("goon #"+i);
	}
	System.out.println(mS);
	for (int i =0; i<5;i++){
	    System.out.println(mS.pop());
	}
	System.out.println(mS);
	for (int i =0; i<5;i++){
	    System.out.println(mS.top());
	}
	System.out.println(mS);
    }
}
