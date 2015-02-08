public class recursion{

    public int fact(int n){
	if (n==0) return 1;
	else return n*(fact(n-1));
    }

    public int fib(int n){
	if (n==1 || n==2) return 1;
	else return fib(n-1) + fib(n-2);
    }

    public int len(String s){
	if (s.equals("")) return 0;
	else return 1+ len(s.substring(1));
    }

    public int count (String s, char c){
	if (s.length()==0) return 0;
	else{
	   if (s.charAt(0)==(c)) return 1+count(s.substring(1),c);
	   else return count(s.substring(1),c);
	}
    }

    //-----------------MAIN---------------------------
    public static void main(String args[]){
	recursion r = new recursion();
	System.out.println(r.fact(7));
	System.out.println(r.fib(35));
	System.out.println(r.len("old"));
	System.out.println(r.count("lllll",'l'));
    }
}
