package samples.sample017;

public class Human {
	String name;
	int age;
	double sight;
	
	Human(String _name,int _age,double _sight){
		this.name = _name;
		this.age = _age;
		this.sight = _sight;
	}
	
	void introduce(){
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("視力" + this.sight + "です。");
	}
}
