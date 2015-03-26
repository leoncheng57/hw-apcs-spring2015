public class myQueue<E>{
    Node<E> dummy;
    Node<E> end;
    ;
    public myQueue<E>(){
	dummy=new Node<E>(null);
	end=dummy;
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
}
