package samples.sample021;

public abstract class Buki {
	int kogekiryoku;
	int sharpness;
	int weight;
	int renge;
	
	Buki(int a,int b,int c,int d){
		kogekiryoku = a;
		sharpness =b;
		weight = c;
		renge = d;
	}

	public abstract int sankaku();

	public abstract int shikaku();

	public abstract int sankakuShikaku();
}
