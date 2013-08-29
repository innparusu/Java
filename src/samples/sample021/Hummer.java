package samples.sample021;

public class Hummer extends Buki {

	Hummer(int a, int b, int c, int d) {
		super(a, b, c, d);
	}

	@Override
	public int sankaku() {
		return kogekiryoku*sharpness*3;
	}

	@Override
	public int shikaku() {
		return kogekiryoku*sharpness*3*2;
	}

	@Override
	public int sankakuShikaku() {
		return kogekiryoku*sharpness*3*3;
	}

}
