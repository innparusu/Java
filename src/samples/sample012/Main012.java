package samples.sample012;

public class Main012 {
	public static void main(String[] args) {
		Main012 hoge = new Main012();
		System.out.println(hoge.max(3,4));
		System.out.println(hoge.min(3,4));
		System.out.println(hoge.max(3,4,5));
		System.out.println(hoge.min(3,4,5));
		System.out.println(hoge.mid(3,4,5));
	}

	int max(int a,int b){
		return a>b?a:b;
	}
	
	int min(int a,int b){
		return a<b?a:b;
	}
	
	int max(int a,int b,int c){
		return max(max(a,b),c);
	}

	int min(int a,int b,int c){
		return min(min(a,b),c);
	}
	
	int mid(int a,int b,int c){
		return a+b+c - max(a,b,c) - min(a,b,c);
	}

}
