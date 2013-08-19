package samples.sample004;

public class Main004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			System.out.println(i+":"+((i%15==0) ? "FIZZ BUZZ" : (i%3==0) ?  "FIZZ" : (i%5==0)? "BUZZ":""));
		}
	}
}