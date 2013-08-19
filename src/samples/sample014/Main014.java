package samples.sample014;

public class Main014 {
	public static void main(String[] args) {
		Main014 hoge = new Main014();
		hoge.fibonacci(8);
	}
	void fibonacci(int n){
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		System.out.println(fib[0]);
		System.out.println(fib[1]);
		for(int i = 2; i <= n;i++){
			fib[i] = fib[i-1] + fib[i-2];
			System.out.println(fib[i]);
		}
	}
}
