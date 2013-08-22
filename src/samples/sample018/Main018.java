package samples.sample018;

public class Main018 {

	public static void main(String[] args) {
		Main018 hoge = new Main018();
		System.out.println(hoge.booleanisPrime(10));

	}

	boolean booleanisPrime(int n){
		for (int i=2;i<=n;i++){
			if(n%i==0){
				return (n==i);
			}
		}
		return false;
	}
}