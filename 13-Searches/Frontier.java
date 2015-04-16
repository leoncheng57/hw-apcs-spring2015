import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }

    // public Node remove() {
    // 	return l.remove(0);
    // }
    
    public Node remove(){
	Node winner = l.get(0);
	for (Node n : l){
	    if (n.getPriority()<winner.getPriority())
		winner = n;
	}
	return winner;
    }
    
    public boolean isEmpty(){
	return l.isEmpty();
    }
}










