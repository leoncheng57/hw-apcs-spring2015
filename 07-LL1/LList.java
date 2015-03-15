public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    
    //will not work if n is negative or out of range
    public Node find(int n){
	Node tmp = l;
	while (n>0){
	    tmp = tmp.getNext();
	    n--;
	}
	return tmp;	
    }
    

    //WILL work if n is negative or out of range
    /*
      public Node find(int n){
	Node tmp = l;
	if (n<0)
	    System.out.print("BAD! the index is negative!");
	while (n>0){
	    tmp = tmp.getNext();
	    n--;
	    if (tmp==null && n!=0){
		System.out.print("BAD! index is out of range! ");
		return tmp;
	    }
	}
	return tmp;	
    }
    */

    //will not work if n is negative or out of range
    public void insert(int n, String s){
	if (n==0)
	    add(s);
	else{
	    Node tmp = l;
	    for (n=n;n>1;tmp=tmp.getNext()){
		n--;
	    }
	    Node newbie = new Node(s);
	    newbie.setNext(tmp.getNext());
	    tmp.setNext(newbie);
	}
    }
    
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
