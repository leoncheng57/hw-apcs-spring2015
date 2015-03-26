public class myQueue<E>{
    Node<E> dummy;
    Node<E> end;
    
    public myQueue(){
	dummy=new Node<E>(null);
	end=dummy;
    }
    public boolean empty(){
	return dummy==end;
    }
    public void enqueue(E data){
	Node<E> stuff = new Node<E>(data);
	end.setNext(stuff);
	end=end.getNext();
    }
    public E dequeue(){
	E tmp = dummy.getNext().getData();
	dummy.setNext(dummy.getNext().getNext());
	return tmp;
    }
    public E head(){
	return dummy.getNext().getData();
    }
    public String toString(){
	String s = "";
	for (Node tmp = dummy; tmp!=end;tmp=tmp.getNext()){
	    s+=tmp+"-->";
	}
	s+=end;
	return s;
    }

    
}
