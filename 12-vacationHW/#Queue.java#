public class Queue<E>{
    Node<E> first, last;
    
    public Queue(E e){
	first = new Node(e);
	last=first;
    }


    public void enqueue(E data){
        if(empty()){
	    first = new Node(data);
	    last = first;
	} else{
	    Node temp = new Node(data);
	    last.setNext(temp);
	    last = temp;
	}
    }

    public E dequeue(){
	if (empty()){
	    return null;
	} else if (first == last){
	    E temp = first.getData();
	    first = null;
	    last = null;
	    return temp;
	} else {
	    E temp = first.getData();
	    first = first.getNext();
	    return temp;
	}
    }

    public boolean empty(){
	return first == null;
    }

    public E head() {
	if (empty()){
	    return null;
	}
	return first.getData();
    }
}
