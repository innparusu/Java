package samples.sample027;

public class Main027 {

	public static void main(String[] args) {
		Class1 instance = new Class1();
		System.out.println(instance.hoge);
		// System.out.println(instance.huga);  privateはクラス外からアクセス出来ない
		System.out.println(instance.getHuga()); // getter or setterを呼び出す必要がある 
		System.out.println(instance.piyo);
		System.out.println(instance.hugi);
	}

}