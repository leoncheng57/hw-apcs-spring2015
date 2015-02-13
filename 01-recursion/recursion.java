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

    //---------Codingbat Problems------------------
    public int fibonacci(int n) {
	if (n==0){
	    return 0;
	}
	if (n==1){
	    return 1;
	}
	return fibonacci(n-1) + fibonacci(n-2);  
    }

    public int bunnyEars2(int bunnies) {
	if (bunnies==0) return 0;
	else{
	    if (bunnies%2==1){ //odd
		return 2+bunnyEars2(bunnies-1);
	    }
	    else{ //even
		return 3+bunnyEars2(bunnies-1);
	    }
	}
    }


    public int strCount(String str, String sub) {
	if (str.length()<sub.length()) return 0;
	else {
	    if (sub.equals(str.substring(0,sub.length()))){
		return 1 + strCount(str.substring(sub.length()),sub);
	    }
	    else{
		return strCount(str.substring(1),sub);
	    }
	}
    }

    public int sumDigits(int n) {
	if (n==0) return 0;
	else return (n%10)+sumDigits(n/10);
    }
    public String allStar(String str) {
	if (str.length()<=1) return str;
	else return str.substring(0,1)+"*"+allStar(str.substring(1));
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
