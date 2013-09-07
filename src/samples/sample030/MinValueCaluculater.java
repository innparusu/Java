package samples.sample030;

public class MinValueCaluculater implements CompareIFace{

	@Override
	public int getValue(int a, int b) {
		return a>b? b:a;
	}

}
