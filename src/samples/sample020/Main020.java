package samples.sample020;

public class Main020 {

	public static void main(String[] args) {
		Main020 hoge = new Main020();
		hoge.twinPrime(30);
	}

	boolean booleanisPrime(int n){
		for (int i=2;i<=n;i++){
			if(n%i==0){
				return (n==i);
			}
		}
		return false;
	}

	void twinPrime(int n){
		int i=3;
		int count = 0;
		while(count < n){
			if(booleanisPrime(i) && booleanisPrime(i+2)){
				System.out.println(i+","+(i+2));
				count++;
			}
			i=i+2;
		}
	}
}
