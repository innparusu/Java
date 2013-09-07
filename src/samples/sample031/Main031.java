package samples.sample031;

public class Main031 {

	public static void main(String[] args) {
		Center center = new Center();
		Average average = new Average();
		int [] array = {2,1,8,10};
		show(center,array);
		show(average,array);
	}

	static void show(BasicValueIFace basic,int[] array){
		System.out.println(basic.getValueName());
		System.out.println(basic.getValue(array));
	}
}
