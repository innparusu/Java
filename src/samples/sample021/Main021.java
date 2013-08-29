package samples.sample021;

public class Main021 {

	public static void main(String[] args) {
		Buki hoge = new TwinSword(20,5,8,7);
		System.out.println(hoge.sankaku());
		System.out.println(hoge.shikaku());
		System.out.println(hoge.sankakuShikaku());

		hoge = new Katana(20,5,8,7);
		System.out.println(hoge.sankaku());
		System.out.println(hoge.shikaku());
		System.out.println(hoge.sankakuShikaku());

		hoge = new Hummer(20,5,8,7);
		System.out.println(hoge.sankaku());
		System.out.println(hoge.shikaku());
		System.out.println(hoge.sankakuShikaku());
	}

}
