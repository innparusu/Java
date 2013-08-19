package samples.sample007;

public class Main007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(double i=0.1; i <=10.0;i=i+0.1){
			if((int)(i+1) > (int)(i+0.5)){
				System.out.println(i+"->"+(int)(i));
			}
			else {
				System.out.println(i+"->"+(int)(i+1));
			}
		}
	}
}
