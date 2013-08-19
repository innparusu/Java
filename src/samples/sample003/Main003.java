package samples.sample003;

public class Main003 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str;
		for(int i=1;i<=100;i++){
			str = (i%15==0) ? "FIZZ BUZZ" : (i%3==0) ?  "FIZZ" : (i%5==0)? "BUZZ":"";
			System.out.println(i+str);
		}
	}
}