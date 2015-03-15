public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println();
	System.out.println(l.find(0));
	System.out.println(l.find(5));
	System.out.println(l.find(7));
	// System.out.println(l.find(8));
	// System.out.println(l.find(-8));
	System.out.println();
	l.insert(0,"a");
	System.out.println(l);	
	l.insert(1,"b");
	System.out.println(l);	
	l.insert(3,"c");
	System.out.println(l);	
	// l.insert(-3,"c");
	// System.out.println(l);	
	// l.insert(99,"c");
	// System.out.println(l);	
	
    }
}
