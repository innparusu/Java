package samples.sample021;

public class Katana extends Buki {

	Katana(int a, int b, int c, int d) {
		super(a, b, c, d);
	}

	@Override
	public int sankaku() {
		return kogekiryoku*sharpness*2;
	}

	@Override
	public int shikaku() {
		return kogekiryoku*sharpness*2*2;
	}

	@Override
	public int sankakuShikaku() {
		return kogekiryoku*sharpness*2*3;
	}

}
