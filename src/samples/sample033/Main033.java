package samples.sample033;

public class Main033 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] answer = new int[4];
		answer[0] = getMax(1,3,5);
		answer[1] = getMin(1,3,5);
		answer[2] = getMid(1,3,5);
		answer[3] = getAve(1,3,5);
		for(int i : answer){
			System.out.println(i);
		}
	}

	public static int getMax(int a,int b){
		return a>b?a:b;
	}

	public static int getMin(int a,int b){
		return a>b?b:a;
	}

	public static int getMax(int a,int b,int c){
		return getMax(a,getMax(b,c));
	}

	public static int getMin(int a,int b,int c){
		return getMin(a,getMin(b,c));
	}
	
	public static int getMid(int a,int b, int c){
		return a+b+c - getMax(a,b,c) - getMin(a,b,c);
	}
	
	public static int getAve(int a,int b, int c){
		return (a+b+c) / 3;
	}
}
