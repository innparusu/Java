package samples.sample025;

public class Main025 {

	public static void main(String[] args) {
		Hoge hoge = new Hoge();
		hoge.printAnime1();
		hoge.printAnime2();
		hoge.printAnime3();

		hoge = new Hoge("hoge");
		hoge.printAnime1();
		hoge.printAnime2();
		hoge.printAnime3();

		hoge = new Hoge("hoge","huga");
		hoge.printAnime1();
		hoge.printAnime2();
		hoge.printAnime3();

		hoge = new Hoge("","huga","piyo");
		hoge.printAnime1();
		hoge.printAnime2();
		hoge.printAnime3();
	}
}
