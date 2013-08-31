package samples.sample023;

abstract public class Pokemon {
	String name;
	int health;
	Type type;
	Skill skill1;
	Skill skill2;
	Skill skill3;
	Skill skill4;
	
	String getName(){
		return name;
	}
	
	String getSkill1Name(){
		return skill1.getName();
	}

	String getSkill2Name(){
		return skill2.getName();
	}

	String getSkill3Name(){
		return skill3.getName();
	}

	String getSkill4Name(){
		return skill4.getName();
	}
	
	abstract int getSkill1Damage();

	abstract int getSkill2Damage();

	abstract int getSkill3Damage();

	abstract int getSkill4Damage();
}
