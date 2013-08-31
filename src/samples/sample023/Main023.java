package samples.sample023;

public class Main023 {

	public static void main(String[] args) {
		Pokemon poke = new Pikachu();
		System.out.println(poke.getName()+"は"+poke.getSkill1Name()+"で"+poke.getSkill1Damage()+"を与える");
	}
}
