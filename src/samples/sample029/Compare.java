package samples.sample029;

public class Compare implements CompareIFace{

	@Override
	public int getMax(int a, int b) {
		return a>b? a:b;
	}

	@Override
	public int getMin(int a, int b) {
		return a>b? b:a;
	}

	@Override
	public int getMid(int a, int b, int c) {
		return a+b+c - getMax(a,getMax(b,c)) - getMin(a,getMin(b,c));
	}
	
	public int getMax(int a, int b, int c){
		return getMax(a,getMax(b,c));
	}
	
}
