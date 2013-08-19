package samples.sample011;

public class Main011 {
	
	public static void main(String[] args) {
		Main011 hoge = new Main011();
		System.out.println(hoge.max(3,4));
		System.out.println(hoge.min(3,4));
		System.out.println(hoge.max(3,4,5));
		System.out.println(hoge.min(3,4,5));
		System.out.println(hoge.mid(3,4,5));
	}

	int max(int a,int b){
		if(a>b){
			return a;
		}
		return b;
	}
	
	int min(int a,int b){
		if(a<b){
			return a;
		}
		return b;
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