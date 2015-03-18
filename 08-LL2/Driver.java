public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	for (int i=0;i<5;i++){
	    l.add(i);
	}
	System.out.println(l);

	System.out.println();
	System.out.println(l.get(3));

	
	System.out.println();
	l.add(0,42);

	System.out.println();
	System.out.println(l.remove(1));
	System.out.println(l);	

    }
}
