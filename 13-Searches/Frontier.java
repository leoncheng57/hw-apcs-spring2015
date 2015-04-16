import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }

    public void addInOrder(Node n){
	double p = n.getPriority();
	int i = 0;
	for (Node tmp : l){
	    if (tmp.getPriority()>p) l.add(i,n);
	    i++;
	}
    }
}










