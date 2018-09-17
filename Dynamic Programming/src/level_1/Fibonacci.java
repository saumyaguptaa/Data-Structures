package level_1;

public class Fibonacci {
	static int memo[], result;
	public static void main(String[] args) {
		int n = 47; 
		memo = new int[n+1];
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		if(memo[n]!=0)
			return memo[n];
		if(n==1||n==2)
			result = 1;
		else
			result= fib(n-1)+fib(n-2);
		memo[n] = result;
		return result;
	}	
}
//disturbed since 47th term