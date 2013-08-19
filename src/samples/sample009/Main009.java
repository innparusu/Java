package samples.sample009;

public class Main009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer hoge = new Integer(5);
		String hugi = hoge.toString();
		String hogehoge = hugi.getClass().getName();
		System.out.println(hoge);
		System.out.println(hogehoge);
	}

}
