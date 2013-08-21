package samples.sample016;

class run {
	private int hoge;

	public void setHoge(int i){
		hoge = i;
	}

	public int getHoge(){
		return hoge;
	}
}

public class Main016{
	public static void main(String[] args){
		run huga = new run();
		huga.setHoge(10);
		System.out.println(huga.getHoge());
	}
}
