package samples.sample019;

public class Main019 {
	public static void main(String[] args) {
		Main019 hoge = new Main019();
		System.out.println(hoge.getSecond(1,2,3,4,5));
		System.out.println(hoge.getSecond(2,3,4,5,1));
		System.out.println(hoge.getSecond(3,4,5,1,2));
		System.out.println(hoge.getSecond(4,5,1,2,3));
		System.out.println(hoge.getSecond(5,1,2,3,4));
		System.out.println(hoge.getSecond(2,3,4,1,5));
		System.out.println(hoge.getSecond(1,1,2,1,3));
		System.out.println(hoge.getFourth(1,1,2,1,3));
		System.out.println(hoge.getThird(1,1,2,1,3));
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
	
	int getFirst(int a,int b,int c,int d,int e){
		return max(max(a,b,c),max(d,e));
	}
	
	int getSecond(int a,int b,int c,int d,int e){
		int[] ary ={a,b,c,d,e};
		for (int i=0; i < ary.length;i++){
			if(getFirst(a,b,c,d,e) == ary[i]){
				ary[i] = 0;
				return getFirst(ary[0],ary[1],ary[2],ary[3],ary[4]);
			}
		}
		return 0;
	}

	int getThird(int a,int b,int c,int d,int e){
		return a+b+c+d+e - getFirst(a,b,c,d,e) - getSecond(a,b,c,d,e) - getFourth(a,b,c,d,e) - getFifth(a,b,c,d,e);
	}

	int getFourth(int a,int b,int c,int d,int e){
		int[] ary ={a,b,c,d,e};
		for (int i=0; i < ary.length;i++){
			if(getFifth(a,b,c,d,e) == ary[i]){
				ary[i] = getFirst(a,b,c,d,e);
				return getFifth(ary[0],ary[1],ary[2],ary[3],ary[4]);
			}
		}
		return 0;
	}
	
	int getFifth(int a,int b,int c,int d,int e){
		return min(min(a,b,c),min(d,e));
	}
}