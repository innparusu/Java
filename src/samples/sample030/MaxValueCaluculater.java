package samples.sample030;

public class MaxValueCaluculater implements CompareIFace{

	@Override
	public int getValue(int a, int b) {
		return a>b? a:b;
	}

}
