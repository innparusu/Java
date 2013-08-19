package samples.sample015;

public class Main015 {

	public static void main(String[] args) {
		Main015 hoge = new Main015();
		System.out.println(hoge.fib(8));
	}

	int fib(int n){
		if(n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
}
