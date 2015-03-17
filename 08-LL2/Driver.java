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
	System.out.println(l.get(0));
	System.out.println(l.get(5));
	System.out.println(l.get(7));
	// System.out.println(l.get(8));
	// System.out.println(l.get(-8));
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

	
	LList emptyL = new LList();
	System.out.println(emptyL.get(0));
    }
}
