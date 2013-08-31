package samples.sample022;

public class Pokemon {
	String name;
	int health;
	Type type;
	Skill skill1;
	Skill skill2;
	Skill skill3;
	Skill skill4;
	
	Pokemon(String pokemonName,int pokemonHealth,String typeName){
		name = pokemonName;
		health = pokemonHealth;
		type = new Type(typeName);
	}

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
	
	int getSkill1Damage(Type enemy){
		double damage=1;
		if(skill1.getType().getTypeName().equals(type.getTypeName())){
			damage *= 1.5;
		}
		return (int)(damage * skill1.getPower());
	}

	int getSkill2Damage(Type enemy){
		double damage=1;
		if(skill2.getType().getTypeName().equals(type.getTypeName())){
			damage *= 1.5;
		}
		return (int)damage * skill2.getPower();
	}

	int getSkill3Damage(Type enemy){
		double damage=1;
		if(skill3.getType().getTypeName().equals(type.getTypeName())){
			damage *= 1.5;
		}
		return (int)damage * skill3.getPower();
	}

	int getSkill4Damage(Type enemy){
		double damage=1;
		if(skill4.getType().getTypeName().equals(type.getTypeName())){
			damage *= 1.5;
		}
		return (int)damage * skill4.getPower();
	}
	
	void setSkill1(String skillName, int skillPower,String typeName){
		skill1 = new Skill(skillName,skillPower,typeName);
	}

	void setSkill2(String skillName, int skillPower,String typeName){
		skill2 = new Skill(skillName,skillPower,typeName);
	}

	void setSkill3(String skillName, int skillPower,String typeName){
		skill3 = new Skill(skillName,skillPower,typeName);
	}

	void setSkill4(String skillName, int skillPower,String typeName){
		skill4 = new Skill(skillName,skillPower,typeName);
	}
}
