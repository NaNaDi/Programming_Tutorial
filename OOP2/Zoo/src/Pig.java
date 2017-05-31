import java.util.Date;

public class Pig extends Animal implements Pet {
	
	Pig(String name, Date birthday, boolean isFemale){
		super.name = name;
		super.birthday = birthday;
		super.isFemale = isFemale;
	}
	
	@Override
	public void pet() {
		System.out.println("Hello my friend! Let's play!");
	}

	@Override
	public void saySomething() {
		System.out.println("Oinc Oinc Oinc");
	}

}
