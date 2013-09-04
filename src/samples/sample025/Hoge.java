package samples.sample025;

public class Hoge {
	String anime1,anime2,anime3;

	Hoge() {
		anime1 = "hoge";
		anime2 = "huga";
		anime3 = "piyo";
	}

	Hoge(String ani1) {
		Hoge huga = new Hoge();
		anime1 = ani1;
		anime2 = huga.anime2;
		anime3 = huga.anime3;
	}

	Hoge(String ani1,String ani2) {
		anime1 = ani1;
		anime2 = ani2;
		anime3 = "piyo";
	}

	Hoge(String ani1,String ani2,String ani3) {
		anime1 = ani1;
		anime2 = ani2;
		anime3 = ani3;
	}

	void printAnime1(){
		System.out.println(anime1);
	}

	void printAnime2(){
		System.out.println(anime2);
	}

	void printAnime3(){
		System.out.println(anime3);
	}
}
