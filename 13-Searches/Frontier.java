import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    // public void add(Node n){
    // 	l.add(n);
    // }

    public void add(Node n){
	int i =0;
	for (Node tmp : l){
	    if(tmp.getPriority()<n.getPriority()){
		i++;
	    }
	}
	l.add(i,n);
    }

    public Node remove() {
	return l.remove(0);
    }
        
    public boolean isEmpty(){
	return l.isEmpty();
    }
}










