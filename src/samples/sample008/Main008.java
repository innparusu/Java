package samples.sample008;

public class Main008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(double i = 0.1;i <= 10.0; i+=0.1){
			double result = (double)(int)(i+0.5);
			System.out.println(i+"->"+result);
		}
	}
}
