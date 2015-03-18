public class LList{

    private Node l = new Node("dummy");
    private int len = 0;

    //NOTE: The dummy is not the zeroth element, but points to the 0th element
    public Node get(int n){
	Node tmp = l;
	while (n>0){
	    tmp = tmp.getNext();
	    n--;
	}
	return tmp.getNext();	
    }
        
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }


    public void add(int n, String s){
	Node tmp = l;
	for (n=n;n>1;tmp=tmp.getNext()){
	    n--;
	}
	Node newbie = new Node(s);
	newbie.setNext(tmp.getNext());
	tmp.setNext(newbie);
	len++;
    }

    public void remove(int n){
	Node tmp = l;
	for (int i=0; i<n;i++){
	    tmp = tmp.getNext();
	}
	tmp.setNext(tmp.getNext().getNext());
	len--;
    }
    
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	s+="\n"+"len="+len;
	return s;
    }
}