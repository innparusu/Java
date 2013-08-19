package samples.sample010;

public class Main010 {

	public static void main(String[] args) {
		Main010 hoge = new Main010();
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
		if(a>b && a>c){
			return a;
		}
		if(b>a && b>c){
			return b;
		}
		return c;
	}

	int min(int a,int b,int c){
		if(a<b && a<c){
			return a;
		}
		if(b<a && b<c){
			return b;
		}
		return c;
	}
	
	int mid(int a,int b,int c){
		return a+b+c - max(a,b,c)- min(a,b,c);
	}
}
