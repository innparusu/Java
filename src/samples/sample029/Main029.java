package samples.sample029;

public class Main029 {

	public static void main(String[] args) {
		Compare compare1 = new Compare();
		CompareIFace compare2 = new Compare();
		getMax(compare1);
		getMax(compare2);
	}

	static void getMax(CompareIFace compare){
		System.out.println(compare.getMax(5,6));
	}
}
