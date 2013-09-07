package samples.sample030;

public class Main030 {

	public static void main(String[] args) {
		MaxValueCaluculater max = new MaxValueCaluculater();
		MinValueCaluculater min = new MinValueCaluculater();
		getValue(max);
		getValue(min);
	}
	
	static void getValue(CompareIFace compare){
		System.out.println(compare.getValue(5, 6));
	}
}
