package samples.sample023;

public class Pikachu extends Pokemon {
	Pikachu(){
		name = "ピカチュウ";
		type = new Thunder();
		health = 85;
		skill1 = new Kaminari();
		skill2 = new Kaminari();
		skill3 = new Kaminari();
		skill4 = new Kaminari();
	}

	@Override
	int getSkill1Damage() {
		if (skill1.getType().isThunder()){
		return (int)(skill1.getPower() * 1.5);
		}
		return skill1.getPower();
	}

	@Override
	int getSkill2Damage() {
		if (skill2.getType().isThunder()){
		return (int)(skill2.getPower() * 1.5);
		}
		return skill2.getPower();
	}

	@Override
	int getSkill3Damage() {
		if (skill3.getType().isThunder()){
		return (int)(skill3.getPower() * 1.5);
		}
		return skill3.getPower();
	}

	@Override
	int getSkill4Damage() {
		if (skill4.getType().isThunder()){
		return (int)(skill4.getPower() * 1.5);
		}
		return skill4.getPower();
	}
}
