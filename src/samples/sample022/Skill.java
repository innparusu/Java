package samples.sample022;

public class Skill {
	String name;
	int power;
	Type type;
	
	Skill(String skillName,int skillpower,String skillTypeName){
		name = skillName;
		power = skillpower;
		type = new Type(skillTypeName);
	}

	String getName(){
		return name;
	}

	int getPower(){
		return power;
	}

	Type getType(){
		return type;
	}
}