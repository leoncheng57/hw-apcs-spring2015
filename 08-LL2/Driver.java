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

	System.out.println();
	l.add(0,"a");
	System.out.println(l);	
	l.add(1,"b");
	System.out.println(l);	
	l.add(3,"c");
	System.out.println(l);	

	System.out.println();
	l.remove(0);
	System.out.println(l);	
	l.remove(5);
	System.out.println(l);	

		
	
	System.out.println();
	LList emptyL = new LList();
	System.out.println(emptyL.get(0));
    }
}
