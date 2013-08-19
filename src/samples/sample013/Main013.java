package samples.sample013;

public class Main013 {

	public static void main(String[] args) {
		Main013 hoge = new Main013();
		System.out.println(hoge.canTriangle(5,12,13));
	}

	boolean canTriangle(int a,int b,int c){
		return max(a,b,c) < min(a,b,c)+mid(a,b,c);
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
