package samples.sample022;

public class Main022 {

	public static void main(String[] args) {
		Pokemon poke1 = new Pokemon("ピカチュウ",85,"電気");
		poke1.setSkill1("10まんボルト",85,"電気");
		System.out.println(poke1.getSkill1Damage(new Type("炎")));
	}

}
