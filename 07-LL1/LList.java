public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

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
