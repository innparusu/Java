package samples.sample034;

import java.util.ArrayList;
import java.util.Iterator;

public class Main034 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(getMax(1,3,5));
		array.add(getMin(1,3,5));
		array.add(getMid(1,3,5));
		array.add(getAve(1,3,5));
		Iterator<Integer> itr = array.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
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
